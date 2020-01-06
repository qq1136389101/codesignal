package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenDigitsOnlyTest {

    @Test
    public void evenDigitsOnly() {
        EvenDigitsOnly evenDigitsOnly = new EvenDigitsOnly();
        assertTrue(evenDigitsOnly.evenDigitsOnly(248622));
        assertFalse(evenDigitsOnly.evenDigitsOnly(642386));
        assertTrue(evenDigitsOnly.evenDigitsOnly(248842));
        assertFalse(evenDigitsOnly.evenDigitsOnly(1));
        assertTrue(evenDigitsOnly.evenDigitsOnly(8));
    }
}