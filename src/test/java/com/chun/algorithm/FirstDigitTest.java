package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstDigitTest {

    @Test
    public void firstDigit() {
        FirstDigit firstDigit = new FirstDigit();
        assertEquals('1', firstDigit.firstDigit("var_1__Int"));
        assertEquals('2', firstDigit.firstDigit("q2q-q"));
        assertEquals('0', firstDigit.firstDigit("0ss"));
        assertEquals('2', firstDigit.firstDigit("_Aas_23"));
        assertEquals('9', firstDigit.firstDigit("a a_933"));
        assertEquals('0', firstDigit.firstDigit("ok0"));

    }
}