package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbsoluteValuesSumMinimizationTest {

    @Test
    public void absoluteValuesSumMinimization() {
        AbsoluteValuesSumMinimization absoluteValuesSumMinimization = new AbsoluteValuesSumMinimization();
        assertEquals(4, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{2, 4, 7}));
        assertEquals(2, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{2, 3}));
        assertEquals(1, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{1, 1, 3, 4}));
        assertEquals(23, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{23}));
        assertEquals(15, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
        assertEquals(-4, absoluteValuesSumMinimization.absoluteValuesSumMinimization(new int[]{-4, -1}));
    }
}