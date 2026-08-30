package ru.maxim.test.models;

public class Array implements IShow {

    private int[] numbers;

    public Array (int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void Print() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    @Override
    public void Print(String info) {
        System.out.println(info);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}

