package ru.maxim.dz8;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileTask {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к первому файлу:");
        String path1 = scanner.nextLine();

        System.out.println("Введите путь ко второму файлу:");
        String path2 = scanner.nextLine();

        Path file1 = Path.of(path1);
        Path file2 = Path.of(path2);

        List<String> lines1 = Files.readAllLines(file1);
        List<String> lines2 = Files.readAllLines(file2);

        System.out.println(lines1);
        System.out.println(lines2);
        compareFiles(lines1, lines2);

        System.out.println();
        System.out.println("Первый файл:");
        findLongestLine(lines1);

        System.out.println();
        System.out.println("Второй файл:");
        findLongestLine(lines2);
    }
    //Метод для сравнения файлов
    public static void compareFiles(List<String> lines1, List<String> lines2) {
        int maxLines = Math.max(lines1.size(), lines2.size());
        for (int i = 0; i < maxLines; i++) {

            if (i < lines1.size() && i < lines2.size()) {
                String line1 = lines1.get(i);
                String line2 = lines2.get(i);

                if (!line1.equals(line2)) {
                    System.out.println("Первый файл: " + line1);
                    System.out.println("Второй файл: " + line2);
                }
            }

            else if (i < lines1.size() && i >= lines2.size()) {
                String line1 = lines1.get(i);

                System.out.println("Первый файл: " + line1);
                System.out.println("Во втором файле такой строки нет.");
            }

            else if (i >= lines1.size() && i < lines2.size()) {
                String line2 = lines2.get(i);

                System.out.println("В первом файле такой строки нет.");
                System.out.println("Второй файл: " + line2);
            }
        }
    }
    //Метод для поиска самой длинной строки
    public static void findLongestLine(List<String> lines) {
        String longestLine = "";

        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);

            if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }
        System.out.println("Самая длинная строка: " + longestLine);
        System.out.println("Длина этой строки: " + longestLine.length() + " символов");
    }
}
