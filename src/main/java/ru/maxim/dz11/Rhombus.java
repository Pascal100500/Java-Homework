package ru.maxim.dz11;

public class Rhombus extends Shape {

    private double width;
    private double height;

    public Rhombus(double width, double height) {
        this.width = width; // длина стороны ромба!
        this.height = height; // длина высоты ромба
    }

    public double getWeight() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}