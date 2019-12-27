package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeRearrangingTest {

    @Test
    public void palindromeRearranging() {
        PalindromeRearranging palindromeRearranging = new PalindromeRearranging();
        assertTrue(palindromeRearranging.palindromeRearranging("aabb"));
        assertFalse(palindromeRearranging.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
        assertTrue(palindromeRearranging.palindromeRearranging("abbcabb"));
        assertTrue(palindromeRearranging.palindromeRearranging("zyyzzzzz"));
        assertTrue(palindromeRearranging.palindromeRearranging("z"));
        assertTrue(palindromeRearranging.palindromeRearranging("zaa"));
        assertFalse(palindromeRearranging.palindromeRearranging("abca"));
    }
}