package com.example.calculator.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService service = new CalculatorService();

    @Test
    public void testSum() {
        assertEquals(5, service.sum(2, 3));
    }
}