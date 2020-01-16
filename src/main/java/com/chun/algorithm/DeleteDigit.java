package com.chun.algorithm;

/**
 * Given some integer, find the maximal number you can obtain by deleting exactly one digit of the given number.
 *
 * Example
 *
 *     For n = 152, the output should be
 *     deleteDigit(n) = 52;
 *     For n = 1001, the output should be
 *     deleteDigit(n) = 101.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] integer n
 *
 *     Guaranteed constraints:
 *     10 ≤ n ≤ 106.
 *
 *     [output] integer
 *
 * @Author chun
 * @Date 2020/1/16 11:23
 */
public class DeleteDigit {

    int deleteDigit(int n) {
        int max = 0;
        for (int t = 1; t < n; t *= 10)
            max = Math.max(n / 10 / t * t + n % t, max);
        return max;
    }
}
