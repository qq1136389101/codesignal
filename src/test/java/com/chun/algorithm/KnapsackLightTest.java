package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnapsackLightTest {

    @Test
    public void knapsackLight() {
        KnapsackLight knapsackLight = new KnapsackLight();
        assertEquals(10, knapsackLight.knapsackLight(10, 5, 6, 4, 8));
        assertEquals(16, knapsackLight.knapsackLight(10, 5, 6, 4, 9));
        assertEquals(7, knapsackLight.knapsackLight(5, 3, 7, 4, 6));
        assertEquals(0, knapsackLight.knapsackLight(10, 2, 11, 3, 1));
        assertEquals(15, knapsackLight.knapsackLight(15, 2, 20, 3, 2));
    }
}