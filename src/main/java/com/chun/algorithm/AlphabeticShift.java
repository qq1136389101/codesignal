package com.chun.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, your task is to replace each of its characters by the next one in the English alphabet; i.e. replace a with b, replace b with c, etc (z would be replaced by a).
 *
 * Example
 *
 * For inputString = "crazy", the output should be alphabeticShift(inputString) = "dsbaz".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     A non-empty string consisting of lowercase English characters.
 *
 *     Guaranteed constraints:
 *     1 ≤ inputString.length ≤ 1000.
 *
 *     [output] string
 *         The resulting string after replacing each of its characters.
 *
 * @Author chun
 * @Date 2020/1/6 11:16
 */
public class AlphabeticShift {
    String alphabeticShift(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) == 'z'){
                stringBuilder.append('a');
            }else{
                stringBuilder.append((char)((int) inputString.charAt(i) + 1));
            }
        }
        return stringBuilder.toString();
    }
}
