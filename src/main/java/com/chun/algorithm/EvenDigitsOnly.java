package com.chun.algorithm;

/**
 * Check if all digits of the given integer are even.
 *
 * Example
 *
 *     For n = 248622, the output should be
 *     evenDigitsOnly(n) = true;
 *     For n = 642386, the output should be
 *     evenDigitsOnly(n) = false.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] integer n
 *
 *     Guaranteed constraints:
 *     1 ≤ n ≤ 109.
 *
 *     [output] boolean
 *         true if all digits of n are even, false otherwise.
 *
 * @Author chun
 * @Date 2020/1/6 10:55
 */
public class EvenDigitsOnly {

    boolean evenDigitsOnly(int n) {
        while (n / 10 != 0){
            if(n % 10 % 2 != 0){
                return false;
            }
            n = n / 10;
        }
        return n % 2 == 0;
    }

}
