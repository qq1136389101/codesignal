package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayReplaceTest {

    @Test
    public void arrayReplace() {
        ArrayReplace arrayReplace = new ArrayReplace();
        assertArrayEquals(new int[]{3, 2, 3}, arrayReplace.arrayReplace(new int[]{1, 2, 1}, 1, 3));
        assertArrayEquals(new int[]{1, 2, 0, 4, 5}, arrayReplace.arrayReplace(new int[]{1, 2, 3, 4, 5}, 3, 0));
        assertArrayEquals(new int[]{10, 10, 10}, arrayReplace.arrayReplace(new int[]{1, 1, 1}, 1, 10));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, arrayReplace.arrayReplace(new int[]{1, 2, 1, 2, 1}, 2, 1));
    }
}