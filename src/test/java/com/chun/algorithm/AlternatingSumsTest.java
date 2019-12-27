package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingSumsTest {

    @Test
    public void alternatingSums() {
        AlternatingSums alternatingSums = new AlternatingSums();
        assertArrayEquals(new int[]{180, 105}, alternatingSums.alternatingSums(new int[]{50, 60, 60, 45, 70}));
        assertArrayEquals(new int[]{100, 50}, alternatingSums.alternatingSums(new int[]{100, 50}));
        assertArrayEquals(new int[]{80, 0}, alternatingSums.alternatingSums(new int[]{80}));
        assertArrayEquals(new int[]{150, 151}, alternatingSums.alternatingSums(new int[]{100, 51, 50, 100}));
    }
}