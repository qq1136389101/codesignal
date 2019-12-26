package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShapeAreaTest {

    @Test
    public void shapeArea() {
        ShapeArea shapeArea = new ShapeArea();
        assertEquals(1, shapeArea.shapeArea(1));
        assertEquals(5, shapeArea.shapeArea(2));
        assertEquals(13, shapeArea.shapeArea(3));
        assertEquals(25, shapeArea.shapeArea(4));
    }
}