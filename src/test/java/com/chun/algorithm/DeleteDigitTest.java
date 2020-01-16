package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDigitTest {

    @Test
    public void deleteDigit() {
        DeleteDigit deleteDigit = new DeleteDigit();
        assertEquals(52, deleteDigit.deleteDigit(152));
        assertEquals(101, deleteDigit.deleteDigit(1001));
        assertEquals(1, deleteDigit.deleteDigit(10));
        assertEquals(22229, deleteDigit.deleteDigit(222219));
        assertEquals(19, deleteDigit.deleteDigit(109));
        assertEquals(22250, deleteDigit.deleteDigit(222250));
    }
}