package ru.maxim.geometricShapes;

public class GeometricShapes {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Красный", true, 5.0);
        shapes[1] = new Rectangle("Синий", false, 4.0, 6.0);
        shapes[2] = new Triangle("Зеленый", true, 3.0, 4.0, 5.0);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Площадь: %.2f%n", shape.getArea());
            System.out.printf("Периметр: %.2f%n", shape.getPerimeter());
        }
    }
}




