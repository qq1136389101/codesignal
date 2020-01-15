package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class LineEncodingTest {

    @Test
    public void lineEncoding() {
        LineEncoding lineEncoding = new LineEncoding();
        assertEquals("2a3bc", lineEncoding.lineEncoding("aabbbc"));
        assertEquals("a2bca2b", lineEncoding.lineEncoding("abbcabb"));
        assertEquals("abcd", lineEncoding.lineEncoding("abcd"));
        assertEquals("4z", lineEncoding.lineEncoding("zzzz"));
        assertEquals("7wa7w", lineEncoding.lineEncoding("wwwwwwwawwwwwww"));
        assertEquals("15c", lineEncoding.lineEncoding("ccccccccccccccc"));
        assertEquals("qwertyuioplkjhg", lineEncoding.lineEncoding("qwertyuioplkjhg"));
    }
}