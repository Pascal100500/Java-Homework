package ru.maxim.geometricShapes;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, boolean isFilled, double sideA, double sideB, double sideC) {
        super(color, isFilled);

        // Проверка существования треугольника
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Треугольник с такими сторонами не существует!");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Геттеры и сеттеры (при необходимости изменения сторон также нужна будет проверка)
    public double getSideA() { return sideA; }
    public double getSideB() { return sideB; }
    public double getSideC() { return sideC; }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2; // Полупериметр
        // Формула Герона
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String toString() {
        return "Triangle[" + super.toString() + ", sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "]";
    }
}
