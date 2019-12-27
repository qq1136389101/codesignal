package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortByHeightTest {

    @Test
    public void sortByHeight() {
        SortByHeight sortByHeight = new SortByHeight();
        assertArrayEquals(new int[]{-1, 150, 160, 170, -1, -1, 180, 190}, sortByHeight.sortByHeight(new int[]{-1, 150, 190, 170, -1, -1, 160, 180}));
        assertArrayEquals(new int[]{-1, -1, -1, -1, -1}, sortByHeight.sortByHeight(new int[]{-1, -1, -1, -1, -1}));
        assertArrayEquals(new int[]{2, 2, 4, 9, 11, 16}, sortByHeight.sortByHeight(new int[]{4, 2, 9, 11, 2, 16}));
        assertArrayEquals(new int[]{1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 2}, sortByHeight.sortByHeight(new int[]{2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1}));
    }
}