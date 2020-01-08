package com.chun.algorithm;

/**
 * Let's define digit degree of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.
 *
 * Given an integer, find its digit degree.
 *
 * Example
 *
 *     For n = 5, the output should be
 *     digitDegree(n) = 0;
 *     For n = 100, the output should be
 *     digitDegree(n) = 1.
 *     1 + 0 + 0 = 1.
 *     For n = 91, the output should be
 *     digitDegree(n) = 2.
 *     9 + 1 = 10 -> 1 + 0 = 1.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] integer n
 *
 *     Guaranteed constraints:
 *     5 ≤ n ≤ 109.
 *
 *     [output] integer
 *
 * @Author chun
 * @Date 2020/1/7 14:51
 */
public class DigitDegree {

    private int time = 0;

    int digitDegree(int n) {
        int sum = 0;
        if(n < 10){
            return time;
        }
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        time++;
        return digitDegree(sum);
    }

    public void reset(){
        this.time = 0;
    }
}
