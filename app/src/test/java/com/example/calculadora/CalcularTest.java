package com.example.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcularTest {
    private Calcular calc;
    @Test
    public void testAdd2Operands() {
        calc = new Calcular();
        int total = Integer.parseInt(calc.calcular("5+3"));
        assertEquals("X + Y operations not working correctly", 8, total);
    }
}
