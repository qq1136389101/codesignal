package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlmostIncreasingSequenceTest {

    @Test
    public void almostIncreasingSequence() {
        AlmostIncreasingSequence almostIncreasingSequence = new AlmostIncreasingSequence();
        assertTrue(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 3, 2}));
        assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 3, 2, 1}));
        assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 1, 2}));
        assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 1, 2, 3, 4, 4}));
        assertFalse(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 4, 10, 4, 2}));
        assertTrue(almostIncreasingSequence.almostIncreasingSequence(new int[]{10, 1, 2, 3, 4, 5}));
        assertTrue(almostIncreasingSequence.almostIncreasingSequence(new int[]{1, 2, 3, 4, 3, 6}));
    }
}