package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonCharacterCountTest {

    @Test
    public void commonCharacterCount() {
        CommonCharacterCount commonCharacterCount = new CommonCharacterCount();
        assertEquals(3, commonCharacterCount.commonCharacterCount("aabcc", "adcaa"));
        assertEquals(4, commonCharacterCount.commonCharacterCount("zzzz", "zzzzzzz"));
        assertEquals(3, commonCharacterCount.commonCharacterCount("abca", "xyzbac"));
        assertEquals(0, commonCharacterCount.commonCharacterCount("a", "b"));
    }
}