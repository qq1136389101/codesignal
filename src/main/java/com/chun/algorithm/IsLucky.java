package com.chun.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.
 *
 * Given a ticket number n, determine if it's lucky or not.
 *
 * Example
 *
 *     For n = 1230, the output should be
 *     isLucky(n) = true;
 *     For n = 239017, the output should be
 *     isLucky(n) = false.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] integer n
 *
 *     A ticket number represented as a positive integer with an even number of digits.
 *
 *     Guaranteed constraints:
 *     10 ≤ n < 106.
 *
 *     [output] boolean
 *         true if n is a lucky ticket number, false otherwise.
 *
 * @Author chun
 * @Date 2019/12/26 18:13
 */
public class IsLucky {

    boolean isLucky(int n) {
        List<Integer> integers = new ArrayList<Integer>();
        while (n / 10 != 0){
            integers.add(n % 10);
            n = n / 10;
        }
        if(n > 0){
            integers.add(n);
        }
        int sum = integers.subList(0, integers.size() / 2).stream().mapToInt(v -> v).sum();
        int sum1 = integers.subList(integers.size() / 2, integers.size()).stream().mapToInt(v -> v).sum();
        return sum == sum1;
    }
}
