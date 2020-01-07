package com.chun.algorithm;

/**
 * Given a string, output its longest prefix which contains only digits.
 *
 * Example
 *
 * For inputString = "123aa1", the output should be
 * longestDigitsPrefix(inputString) = "123".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     Guaranteed constraints:
 *     3 ≤ inputString.length ≤ 100.
 *
 *     [output] string
 *
 * @Author chun
 * @Date 2020/1/7 14:44
 */
public class LongestDigitsPrefix {
    String longestDigitsPrefix(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if('0' <= inputString.charAt(i) && inputString.charAt(i) <= '9'){
                stringBuilder.append(inputString.charAt(i));
            }else{
                return stringBuilder.toString();
            }
        }
        return stringBuilder.toString();
    }
}
