package com.chun.algorithm;

/**
 * You are given an array of integers representing coordinates of obstacles situated on a straight line.
 *
 * Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.
 *
 * Find the minimal length of the jump enough to avoid all the obstacles.
 *
 * Example
 *
 * For inputArray = [5, 3, 6, 7, 9], the output should be
 * avoidObstacles(inputArray) = 4.
 *
 * Check out the image below for better understanding:
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer inputArray
 *
 *     Non-empty array of positive integers.
 *
 *     Guaranteed constraints:
 *     2 ≤ inputArray.length ≤ 1000,
 *     1 ≤ inputArray[i] ≤ 1000.
 *
 *     [output] integer
 *         The desired length.
 *
 * @Author chun
 * @Date 2020/1/3 11:46
 */
public class AvoidObstacles {

    int avoidObstacles(int[] inputArray) {
        int step = 2;
        int i = 0;
        while (i != inputArray.length){
            for (i = 0; i < inputArray.length; i++) {
                if(inputArray[i] % step == 0){
                    step ++;
                    break;
                }
            }
        }
        return step;
    }
}
