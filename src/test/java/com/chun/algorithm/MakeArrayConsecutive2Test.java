package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakeArrayConsecutive2Test {

    @Test
    public void makeArrayConsecutive2() {
        MakeArrayConsecutive2 makeArrayConsecutive2 = new MakeArrayConsecutive2();
        assertEquals(3, makeArrayConsecutive2.makeArrayConsecutive2(new int[]{6, 2, 3, 8}));
        assertEquals(2, makeArrayConsecutive2.makeArrayConsecutive2(new int[]{0, 3}));
        assertEquals(2, makeArrayConsecutive2.makeArrayConsecutive2(new int[]{6, 3}));
    }
}