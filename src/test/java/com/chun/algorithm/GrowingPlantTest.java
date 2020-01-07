package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class GrowingPlantTest {

    @Test
    public void growingPlant() {
        GrowingPlant growingPlant = new GrowingPlant();
        assertEquals(10, growingPlant.growingPlant(100, 10, 910));
        assertEquals(1, growingPlant.growingPlant(10, 9, 4));
        assertEquals(2, growingPlant.growingPlant(5, 2, 7));
        assertEquals(110, growingPlant.growingPlant(7, 3, 443));
        assertEquals(5, growingPlant.growingPlant(6, 5, 10));
    }
}