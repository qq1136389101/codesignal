package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class AvoidObstaclesTest {

    @Test
    public void  avoidObstacles() {
        AvoidObstacles avoidObstacles = new AvoidObstacles();
        assertEquals(4, avoidObstacles.avoidObstacles(new int[]{5, 3, 6, 7, 9}));
        assertEquals(4, avoidObstacles.avoidObstacles(new int[]{2, 3}));
        assertEquals(7, avoidObstacles.avoidObstacles(new int[]{1, 4, 10, 6, 2}));
        assertEquals(6, avoidObstacles.avoidObstacles(new int[]{1000, 999}));
        assertEquals(3, avoidObstacles.avoidObstacles(new int[]{19, 32, 11, 23}));
        assertEquals(6, avoidObstacles.avoidObstacles(new int[]{5, 8, 9, 13, 14}));
    }
}