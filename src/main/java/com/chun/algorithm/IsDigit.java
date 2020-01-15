package com.chun.algorithm;

/**
 * Determine if the given character is a digit or not.
 *
 * Example
 *
 *     For symbol = '0', the output should be
 *     isDigit(symbol) = true;
 *     For symbol = '-', the output should be
 *     isDigit(symbol) = false.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] char symbol
 *
 *     A character which is either a digit or not.
 *
 *     [output] boolean
 *         true if symbol is a digit, false otherwise.
 *
 * @Author chun
 * @Date 2020/1/15 17:07
 */
public class IsDigit {
    boolean isDigit(char symbol) {
        return Character.isDigit(symbol);
    }
}
