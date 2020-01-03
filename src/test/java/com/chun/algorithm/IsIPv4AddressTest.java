package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsIPv4AddressTest {

    @Test
    public void isIPv4Address() {
        IsIPv4Address isIPv4Address = new IsIPv4Address();
        assertTrue(isIPv4Address.isIPv4Address("172.16.254.1"));
        assertFalse(isIPv4Address.isIPv4Address("172.316.254.1"));
        assertFalse(isIPv4Address.isIPv4Address(".254.255.0"));
        assertFalse(isIPv4Address.isIPv4Address("1"));
        assertTrue(isIPv4Address.isIPv4Address("0.254.255.0"));
        assertFalse(isIPv4Address.isIPv4Address("1.23.256.255."));
        assertFalse(isIPv4Address.isIPv4Address("1.23.256.."));
        assertFalse(isIPv4Address.isIPv4Address("0..1.0"));
        assertFalse(isIPv4Address.isIPv4Address("35..36.9.9.0"));
    }
}