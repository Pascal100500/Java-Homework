package ru.maxim.dz3;

import java.util.Scanner;

public class Task7_dz3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона:");
        int start = scanner.nextInt();
        System.out.println("Введите конец диапазона:");
        int end = scanner.nextInt();

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int num = start; num <= end; num++ ) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

    }
}
