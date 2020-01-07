package com.chun.algorithm;

import org.junit.Test;
import static org.junit.Assert.*;

public class DifferentSymbolsNaiveTest {

    @Test
    public void differentSymbolsNaive() {
        DifferentSymbolsNaive differentSymbolsNaive = new DifferentSymbolsNaive();
        assertEquals(3, differentSymbolsNaive.differentSymbolsNaive("cabca"));
        assertEquals(2, differentSymbolsNaive.differentSymbolsNaive("aba"));
        assertEquals(1, differentSymbolsNaive.differentSymbolsNaive("ccccccccccc"));
        assertEquals(3, differentSymbolsNaive.differentSymbolsNaive("bcaba"));
        assertEquals(10, differentSymbolsNaive.differentSymbolsNaive("codesignal"));
    }
}