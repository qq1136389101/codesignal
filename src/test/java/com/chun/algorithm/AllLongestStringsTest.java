package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AllLongestStringsTest {

    @Test
    public void allLongestStrings() {
        AllLongestStrings allLongestStrings = new AllLongestStrings();
        assertArrayEquals(new String[]{"aba", "vcd", "aba"}, allLongestStrings.allLongestStrings(new String[]{"aba","aa","ad","vcd","aba"}));
        assertArrayEquals(new String[]{"aa"}, allLongestStrings.allLongestStrings(new String[]{"aa"}));
        assertArrayEquals(new String[]{"eeee", "abcd"}, allLongestStrings.allLongestStrings(new String[]{"abc","eeee","abcd","dcd"}));
    }
}