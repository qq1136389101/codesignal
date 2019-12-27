package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddBorderTest {

    @Test
    public void addBorder() {
        AddBorder addBorder = new AddBorder();
        assertArrayEquals(new String[]{"*****", "*abc*", "*ded*", "*****"}, addBorder.addBorder(new String[]{"abc", "ded"}));
        assertArrayEquals(new String[]{"***","*a*","***"}, addBorder.addBorder(new String[]{"a"}));
        assertArrayEquals(new String[]{"****","*aa*","****","*zz*","****"}, addBorder.addBorder(new String[]{"aa","**","zz"}));
        assertArrayEquals(new String[]{"*******","*abcde*","*fghij*","*klmno*","*pqrst*","*uvwxy*","*******"}, addBorder.addBorder(new String[]{"abcde","fghij","klmno","pqrst","uvwxy"}));
    }
}