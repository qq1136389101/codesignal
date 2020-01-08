package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class DigitDegreeTest {

    @Test
    public void digitDegree() {
        DigitDegree digitDegree = new DigitDegree();
        assertEquals(0, digitDegree.digitDegree(5));
        digitDegree.reset();

        assertEquals(1, digitDegree.digitDegree(100));
        digitDegree.reset();

        assertEquals(2, digitDegree.digitDegree(91));
        digitDegree.reset();

        assertEquals(2, digitDegree.digitDegree(99));
        digitDegree.reset();

        assertEquals(1, digitDegree.digitDegree(1000000000));
        digitDegree.reset();

        assertEquals(0, digitDegree.digitDegree(9));
        digitDegree.reset();

        assertEquals(2, digitDegree.digitDegree(73));
        digitDegree.reset();
    }
}