package ru.maxim.gamestore;

import java.security.GeneralSecurityException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseInitializer {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String username = "GAMESTORE";
        String password = "gamestore123";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Подключение к Oracle успешно!");

            var statement = connection.createStatement();

            var query = "SELECT COUNT(*) FROM categories";

            var result = statement.executeQuery(query);

            if (result.next()) {
                int count = result.getInt(1);

                System.out.println("Количество категорий: " + count);
                if (count == 0) {
                    System.out.println("Категорий нет. Создаём начальные данные.");
                    var insertQuery = "INSERT INTO categories (name) VALUES ('RPG')";
                    statement.executeUpdate(insertQuery);
                    System.out.println("Категория RPG создана.");
                }

                var queryAdmin = "SELECT COUNT(*) FROM users WHERE role = 'ADMIN'";

                var resultAdmin = statement.executeQuery(queryAdmin);

                if (resultAdmin.next()) {

                    int countAdmin = resultAdmin.getInt(1);

                    System.out.println("Количество пользователей с ролью ADMIN: " + countAdmin);

                    if (countAdmin == 0) {

                        System.out.println(
                                "Пользователей с ролью ADMIN нет. Создаём администратора."
                        );

                        String adminPassword = "admin123";

                        String salt = PasswordHasher.generateSalt();

                        String hash = PasswordHasher.hashPassword(adminPassword, salt);

                        System.out.println("Пароль: " + adminPassword);
                        System.out.println("Salt: " + salt);
                        System.out.println("Hash: " + hash);

                        var insertAdmin = connection.prepareStatement(
                                "INSERT INTO users (username, password, role, salt) VALUES (?, ?, ?, ?)"
                        );
                        insertAdmin.setString(1, "admin");
                        insertAdmin.setString(2, hash);
                        insertAdmin.setString(3, "ADMIN");
                        insertAdmin.setString(4, salt);

                        insertAdmin.executeUpdate();
                        System.out.println("Администратор создан.");

                    }
                }
            }


        } catch (SQLException e) {
            System.out.println("Ошибка подключения к Oracle:");
            e.printStackTrace();
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(e);
        }
    }
}