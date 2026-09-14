package ru.maxim.dz10;

import java.util.Arrays;
import java.util.Random;

public class MainStreamAPI {
    public static void main(String[] args) {

        int[] numbers = new int[20];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(-500, 501);
        }

        System.out.println("Полученный массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        long countPositive = Arrays.stream(numbers)
                .filter(number -> number > 0)
                .count();

        long countNegative = Arrays.stream(numbers)
                .filter(number -> number < 0)
                .count();

        long countTwoDigit = Arrays.stream(numbers)
                .filter(number -> Math.abs(number) >= 10 && Math.abs(number) <= 99)
                .count();

        System.out.println("Положительных чисел: " + countPositive);
        System.out.println("Отрицательных чисел: " + countNegative);
        System.out.println("Двузначных чисел: " + countTwoDigit);

        long countPalindrome = Arrays.stream(numbers)
                .filter(number -> Math.abs(number) >= 10)
                .filter(number -> isPalindrome(number))
                .count();
        System.out.println("Зеркальных чисел: " + countPalindrome);
    }
    public static boolean isPalindrome(int number) {
        String text = String.valueOf(number);

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}