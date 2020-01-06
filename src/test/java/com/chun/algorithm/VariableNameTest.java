package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class VariableNameTest {

    @Test
    public void variableName() {
        VariableName variableName = new VariableName();
        assertTrue(variableName.variableName("var_1__Int"));
        assertFalse(variableName.variableName("qq-q"));
        assertFalse(variableName.variableName("2w2"));
        assertFalse(variableName.variableName(" variable"));
        assertFalse(variableName.variableName("va[riable0"));
        assertTrue(variableName.variableName("variable0"));
    }
}