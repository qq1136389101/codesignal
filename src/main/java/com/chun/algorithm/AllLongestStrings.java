package com.chun.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of strings, return another array containing all of its longest strings.
 *
 * Example
 *
 * For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 * allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.string inputArray
 *
 *     A non-empty array.
 *
 *     Guaranteed constraints:
 *     1 ≤ inputArray.length ≤ 10,
 *     1 ≤ inputArray[i].length ≤ 10.
 *
 *     [output] array.string
 *         Array of the longest strings, stored in the same order as in the inputArray.
 *
 * @Author chun
 * @Date 2019/12/26 17:20
 */
public class AllLongestStrings {

    String[] allLongestStrings(String[] inputArray) {
        int maxLen = 0;
        List<String> res = new ArrayList<String>();

        for (int i = 0; i < inputArray.length; i++) {
            int len = inputArray[i].length();
            if(len == maxLen){
                res.add(inputArray[i]);
            }
            if(len > maxLen){
                maxLen = len;
                res.clear();
                res.add(inputArray[i]);
            }
        }
        String[] resArray = new String[]{};
        return res.toArray(resArray);
    }

}
