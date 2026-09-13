package ru.maxim.dz9;
import java.util.Random;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int[] numbers = new int[10];

        int[] sumResult = new int[1];
        double[] averageResult = new double[1];

        Thread fillThread = new Thread(() -> {
            System.out.println("Работает поток заполнения массива");
            Random random = new Random();
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }
        });

        Thread sumThread = new Thread(() -> {
            try {
                fillThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Поток суммы начал работу");

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            sumResult[0] = sum;
        });

        Thread averageThread = new Thread(() -> {
            try {
                fillThread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Поток среднего значения начал работу");

            int sum = 0;

            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            double average = (double) sum / numbers.length;

            averageResult[0] = average;
        });

        fillThread.start();
        sumThread.start();
        averageThread.start();

        fillThread.join();
        sumThread.join();
        averageThread.join();

        System.out.println("Полученный массив:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Сумма: " + sumResult[0]);
        System.out.println("Среднее арифметическое: " + averageResult[0]);

    }
}
