package ru.maxim.dz11;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 4);
        Square square = new Square(5);
        Triangle triangle = new Triangle(10, 6);
        Rhombus rhombus = new Rhombus(10, 5);

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());
        System.out.println("Площадь квадрата: " + square.calculateArea());
        System.out.println("Площадь треугольника: " + triangle.calculateArea());
        System.out.println("Площадь ромба: " + rhombus.calculateArea());
    }
}