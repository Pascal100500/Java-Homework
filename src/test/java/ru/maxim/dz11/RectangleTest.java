package ru.maxim.dz11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void calculateAreaTest() {

        Rectangle rectangle = new Rectangle(5, 4);

        double result = rectangle.calculateArea();

        assertEquals(20.0, result);
    }
}