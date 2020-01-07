package com.chun.algorithm;

/**
 * Find the leftmost digit that occurs in a given string.
 *
 * Example
 *
 *     For inputString = "var_1__Int", the output should be
 *     firstDigit(inputString) = '1';
 *     For inputString = "q2q-q", the output should be
 *     firstDigit(inputString) = '2';
 *     For inputString = "0ss", the output should be
 *     firstDigit(inputString) = '0'.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     A string containing at least one digit.
 *
 *     Guaranteed constraints:
 *     3 ≤ inputString.length ≤ 10.
 *
 *     [output] char
 *
 * @Author chun
 * @Date 2020/1/7 11:34
 */
public class FirstDigit {
    char firstDigit(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            if('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9'){
                return inputString.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println((int)'0');
    }
}
