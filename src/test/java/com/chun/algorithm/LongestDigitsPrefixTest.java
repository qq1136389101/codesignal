package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestDigitsPrefixTest {

    @Test
    public void longestDigitsPrefix() {
        LongestDigitsPrefix longestDigitsPrefix = new LongestDigitsPrefix();
        assertEquals("123", longestDigitsPrefix.longestDigitsPrefix("123aa1"));
        assertEquals("0123456789", longestDigitsPrefix.longestDigitsPrefix("0123456789"));
        assertEquals("", longestDigitsPrefix.longestDigitsPrefix("  3) always check for whitespaces"));
        assertEquals("12", longestDigitsPrefix.longestDigitsPrefix("12abc34"));
        assertEquals("", longestDigitsPrefix.longestDigitsPrefix("the output is 42"));
        assertEquals("", longestDigitsPrefix.longestDigitsPrefix("aaaaaaa"));
    }
}