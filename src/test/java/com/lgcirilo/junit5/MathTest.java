package com.lgcirilo.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @Test
    public void maxTest() {
        int actualMax = Math.max(3,5);
        int expectedMax = 5;
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void minTest() {
        int actualMin = Math.min(3,5);
        int expectedMin = 3;
        assertEquals(expectedMin, actualMin);
    }
}
