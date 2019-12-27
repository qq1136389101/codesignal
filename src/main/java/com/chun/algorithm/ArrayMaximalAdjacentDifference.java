package com.chun.algorithm;

/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 *
 * Example
 *
 * For inputArray = [2, 4, 1, 0], the output should be
 * arrayMaximalAdjacentDifference(inputArray) = 3.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer inputArray
 *
 *     Guaranteed constraints:
 *     3 ≤ inputArray.length ≤ 10,
 *     -15 ≤ inputArray[i] ≤ 15.
 *
 *     [output] integer
 *         The maximal absolute difference.
 *
 * @Author chun
 * @Date 2019/12/27 16:15
 */
public class ArrayMaximalAdjacentDifference {
    int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDifference = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            maxDifference = Math.max(maxDifference, Math.abs(inputArray[i] - inputArray[i+1]));
        }
        return maxDifference;
    }
}
