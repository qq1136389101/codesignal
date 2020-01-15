package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildPalindromeTest {

    @Test
    public void buildPalindrome() {
        BuildPalindrome buildPalindrome = new BuildPalindrome();
        assertEquals("abcdcba", buildPalindrome.buildPalindrome("abcdc"));
        assertEquals("abababa", buildPalindrome.buildPalindrome("ababab"));
        assertEquals("abba", buildPalindrome.buildPalindrome("abba"));
        assertEquals("abaaba", buildPalindrome.buildPalindrome("abaa"));
        assertEquals("aaaabaaaa", buildPalindrome.buildPalindrome("aaaaba"));
        assertEquals("abcba", buildPalindrome.buildPalindrome("abc"));
        assertEquals("kebabek", buildPalindrome.buildPalindrome("kebab"));
    }
}