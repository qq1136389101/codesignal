package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseInParenthesesTest {

    @Test
    public void reverseInParentheses() {
        ReverseInParentheses reverseInParentheses = new ReverseInParentheses();
        assertEquals("rab", reverseInParentheses.reverseInParentheses("(bar)"));
        assertEquals("foorabbaz", reverseInParentheses.reverseInParentheses("foo(bar)baz"));
        assertEquals("foorabbazmilb", reverseInParentheses.reverseInParentheses("foo(bar)baz(blim)"));
        assertEquals("foobazrabblim", reverseInParentheses.reverseInParentheses("foo(bar(baz))blim"));
        assertEquals("", reverseInParentheses.reverseInParentheses(""));
        assertEquals("", reverseInParentheses.reverseInParentheses("()"));
        assertEquals("cbadgfe", reverseInParentheses.reverseInParentheses("(abc)d(efg)"));
    }
}