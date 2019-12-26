package com.chun.algorithm;

/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 *
 * A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
 *
 *
 *
 * Example
 *
 * For n = 2, the output should be
 * shapeArea(n) = 5;
 * For n = 3, the output should be
 * shapeArea(n) = 13.
 * Input/Output
 *
 * [execution time limit] 3 seconds (java)
 *
 * [input] integer n
 *
 * Guaranteed constraints:
 * 1 ≤ n < 104.
 *
 * [output] integer
 *
 * The area of the n-interesting polygon.
 *
 * @Author chun
 * @Date 2019/12/26 10:15
 */
public class ShapeArea {

    /**
     * 实际就是 n 次方 加上 (n-1) 次方
     *
     * @param n
     * @return
     */
    int shapeArea(int n) {
        return 2 * n * n - 2 * n + 1;
    }
}
