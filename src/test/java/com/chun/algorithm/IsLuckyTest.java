package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsLuckyTest {

    @Test
    public void isLucky() {
        IsLucky isLucky = new IsLucky();
        assertTrue(isLucky.isLucky(1230));
        assertFalse(isLucky.isLucky(239017));
        assertTrue(isLucky.isLucky(1010));
        assertTrue(isLucky.isLucky(134008));
    }
}