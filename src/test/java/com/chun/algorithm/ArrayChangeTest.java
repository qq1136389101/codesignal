package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayChangeTest {

    @Test
    public void arrayChange() {
        ArrayChange arrayChange = new ArrayChange();
        assertEquals(3, arrayChange.arrayChange(new int[]{1, 1, 1}));
        assertEquals(5, arrayChange.arrayChange(new int[]{-1000, 0, -2, 0}));
        assertEquals(12, arrayChange.arrayChange(new int[]{2, 1, 10, 1}));
        assertEquals(13, arrayChange.arrayChange(new int[]{2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15}));
        assertEquals(25559, arrayChange.arrayChange(new int[]{3122, -645, 2616, 13213, -8069}));
    }
}