package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMaximalAdjacentDifferenceTest {

    @Test
    public void arrayMaximalAdjacentDifference() {
        ArrayMaximalAdjacentDifference arrayMaximalAdjacentDifference = new ArrayMaximalAdjacentDifference();
        assertEquals(3, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(new int[]{2, 4, 1, 0}));
        assertEquals(0, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(new int[]{1, 1, 1, 1}));
        assertEquals(7, arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(new int[]{-1, 4, 10, 3, -2}));
    }
}