package ru.maxim.dz5;
import java.util.ArrayList;

public class Array<T extends Number & Comparable<T>> {
    private ArrayList<T> numbers;

    public Array() {
        numbers = new ArrayList<>();
    }

    public void add(T number) {
        numbers.add(number);
    }

    public void print() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
