package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreSimilarTest {

    @Test
    public void areSimilar() {
        AreSimilar areSimilar = new AreSimilar();
        assertTrue(areSimilar.areSimilar(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        assertTrue(areSimilar.areSimilar(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        assertFalse(areSimilar.areSimilar(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        assertFalse(areSimilar.areSimilar(new int[]{1, 1, 4}, new int[]{1, 2, 3}));
        assertFalse(areSimilar.areSimilar(new int[]{1, 2, 3}, new int[]{1, 10, 2}));
    }
}