package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsDigitTest {

    @Test
    public void isDigit() {
        IsDigit isDigit = new IsDigit();
        assertTrue(isDigit.isDigit('0'));
        assertFalse(isDigit.isDigit('-'));
        assertFalse(isDigit.isDigit('o'));
        assertTrue(isDigit.isDigit('1'));
        assertTrue(isDigit.isDigit('2'));
        assertFalse(isDigit.isDigit('!'));
    }
}