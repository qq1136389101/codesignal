package com.chun.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixElementsSumTest {

    @Test
    public void matrixElementsSum() {
        MatrixElementsSum matrixElementsSum = new MatrixElementsSum();
        assertEquals(9, matrixElementsSum.matrixElementsSum(new int[][]{{0,1,1,2}, {0,5,0,0}, {2,0,3,3}}));
        assertEquals(9, matrixElementsSum.matrixElementsSum(new int[][]{{1,1,1,0}, {0,5,0,1}, {2,1,3,10}}));
        assertEquals(18, matrixElementsSum.matrixElementsSum(new int[][]{{1,1,1}, {2,2,2}, {3,3,3}}));
        assertEquals(0, matrixElementsSum.matrixElementsSum(new int[][]{{0}}));
        assertEquals(5, matrixElementsSum.matrixElementsSum(new int[][]{{1,0,3}, {0,2,1}, {1,2,0}}));
    }
}