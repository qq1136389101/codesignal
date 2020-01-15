package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsMAC48AddressTest {

    @Test
    public void isMAC48Address() {
        IsMAC48Address isMAC48Address = new IsMAC48Address();
        assertTrue(isMAC48Address.isMAC48Address("00-1B-63-84-45-E6"));
        assertFalse(isMAC48Address.isMAC48Address("Z1-1B-63-84-45-E6"));
        assertFalse(isMAC48Address.isMAC48Address("not a MAC-48 address"));
        assertTrue(isMAC48Address.isMAC48Address("FF-FF-FF-FF-FF-FF"));
    }
}