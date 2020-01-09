package com.chun.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * A string is said to be beautiful if each letter in the string appears at most as many times as the previous letter in the alphabet within the string; ie: b occurs no more times than a; c occurs no more times than b; etc.
 *
 * Given a string, check whether it is beautiful.
 *
 * Example
 *
 *     For inputString = "bbbaacdafe", the output should be isBeautifulString(inputString) = true;
 *
 *     This string contains 3 as, 3 bs, 1 c, 1 d, 1 e, and 1 f (and 0 of every other letter), so since there aren't any letters that appear more frequently than the previous letter, this string qualifies as beautiful.
 *
 *     For inputString = "aabbb", the output should be isBeautifulString(inputString) = false;
 *
 *     Since there are more bs than as, this string is not beautiful.
 *
 *     For inputString = "bbc", the output should be isBeautifulString(inputString) = false.
 *
 *     Although there are more bs than cs, this string is not beautiful because there are no as, so therefore there are more bs than as.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     A string of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     3 ≤ inputString.length ≤ 50.
 *
 *     [output] boolean
 *         Return true if the string is beautiful, false otherwise.
 *
 * @Author chun
 * @Date 2020/1/9 9:58
 */
public class IsBeautifulString {

    boolean isBeautifulString(String inputString) {
        int[] ints = new int[26];
        for (int i = 0; i < inputString.length(); i++) {
            int charIndex = (int)inputString.charAt(i) - 97;
            ints[charIndex]++;
        }

        for (int i = 0; i < ints.length-1; i++) {
            if(ints[i] < ints[i+1]){
                return false;
            }
        }
        return true;
    }
}
