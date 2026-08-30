package ru.maxim;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую цифру числа:");
        int number1 = scanner.nextInt();
        System.out.println("Введите вторую цифру числа:");
        int number2 = scanner.nextInt();
        System.out.println("Введите третье цифру числа:");
        int number3 = scanner.nextInt();
        int result = number1 * 100 + number2 * 10 + number3;
        System.out.println("Полученное число: " + result);
    }
}
