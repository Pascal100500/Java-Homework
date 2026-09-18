package ru.maxim.dz11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void calculateAreaTest() {

        Square square = new Square(5);

        double result = square.calculateArea();

        assertEquals(25.0, result);
    }
}