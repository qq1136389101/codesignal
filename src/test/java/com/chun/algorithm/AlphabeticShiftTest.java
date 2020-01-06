package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabeticShiftTest {

    @Test
    public void alphabeticShift() {
        AlphabeticShift alphabeticShift = new AlphabeticShift();
        assertEquals("dsbaz", alphabeticShift.alphabeticShift("crazy"));
        assertEquals("bbbbcccdde", alphabeticShift.alphabeticShift("aaaabbbccd"));
        assertEquals("gvaaz", alphabeticShift.alphabeticShift("fuzzy"));
        assertEquals("dpeftjhobm", alphabeticShift.alphabeticShift("codesignal"));
    }
}