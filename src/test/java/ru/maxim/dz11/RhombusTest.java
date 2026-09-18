package ru.maxim.dz11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RhombusTest {

    @Test
    public void calculateAreaTest() {

        Rhombus rhombus = new Rhombus(10, 5);

        double result = rhombus.calculateArea();

        assertEquals(50.0, result);
    }
}