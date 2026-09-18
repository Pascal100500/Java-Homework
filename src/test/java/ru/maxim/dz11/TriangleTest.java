package ru.maxim.dz11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void calculateAreaTest() {

        Triangle triangle = new Triangle(10, 6);

        double result = triangle.calculateArea();

        assertEquals(30.0, result);
    }
}