package ru.maxim.gamestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1521/XE";
        String username = "GAMESTORE";
        String password = "gamestore123";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Подключение к Oracle успешно!");
            var statement = connection.createStatement();
            var query = "SELECT * FROM categories";
            var result = statement.executeQuery(query);
            if (result.next()) {
                System.out.println("ID: " + result.getLong("ID"));
                System.out.println("Название: " + result.getString("NAME"));
            }

        } catch (SQLException e) {
            System.out.println("Ошибка подключения к Oracle:");
            e.printStackTrace();
        }
    }
}