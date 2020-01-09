package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsBeautifulStringTest {

    @Test
    public void isBeautifulString() {
        IsBeautifulString isBeautifulString = new IsBeautifulString();
        assertTrue(isBeautifulString.isBeautifulString("bbbaacdafe"));
        assertFalse(isBeautifulString.isBeautifulString("aabbb"));
        assertFalse(isBeautifulString.isBeautifulString("bbc"));
        assertFalse(isBeautifulString.isBeautifulString("bbbaa"));
        assertFalse(isBeautifulString.isBeautifulString("abcdefghijklmnopqrstuvwxyzz"));
        assertTrue(isBeautifulString.isBeautifulString("abcdefghijklmnopqrstuvwxyz"));
        assertTrue(isBeautifulString.isBeautifulString("abcdefghijklmnopqrstuvwxyzqwertuiopasdfghjklxcvbnm"));
        assertFalse(isBeautifulString.isBeautifulString("fyudhrygiuhdfeis"));
    }
}