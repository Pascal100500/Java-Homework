package ru.maxim.dz11;

public class Square extends Shape {

    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public double calculateArea() {
        return width * width;
    }
}