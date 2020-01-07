package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtractEachKthTest {

    @Test
    public void extractEachKth() {
        ExtractEachKth extractEachKth = new ExtractEachKth();
        assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10}, extractEachKth.extractEachKth(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
        assertArrayEquals(new int[]{}, extractEachKth.extractEachKth(new int[]{1, 1, 1, 1, 1}, 1));
        assertArrayEquals(new int[]{1, 1, 1, 1}, extractEachKth.extractEachKth(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 2));
        assertArrayEquals(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, extractEachKth.extractEachKth(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 10));
        assertArrayEquals(new int[]{2, 6, 10}, extractEachKth.extractEachKth(new int[]{2, 4, 6, 8, 10}, 2));
    }
}