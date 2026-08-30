package ru.maxim;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        double number = scanner.nextInt();
        System.out.println("Введите процент для подсчета:");
        double procent = scanner.nextInt();
        System.out.println("Процент " + procent + " от числа " + number + " будет равен = " + (number * procent / 100.0));
    }
}
