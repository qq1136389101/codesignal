package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreEquallyStrongTest {

    @Test
    public void areEquallyStrong() {
        AreEquallyStrong areEquallyStrong = new AreEquallyStrong();
        assertTrue(areEquallyStrong.areEquallyStrong(10, 15, 15, 10));
        assertTrue(areEquallyStrong.areEquallyStrong(15, 10, 15, 10));
        assertFalse(areEquallyStrong.areEquallyStrong(10, 15, 5, 20));
    }
}