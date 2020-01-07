package com.chun.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a string, find the number of different characters in it.
 *
 * Example
 *
 * For s = "cabca", the output should be
 * differentSymbolsNaive(s) = 3.
 *
 * There are 3 different characters a, b and c.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string s
 *
 *     A string of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     3 ≤ s.length ≤ 1000.
 *
 *     [output] integer
 *
 * @Author chun
 * @Date 2020/1/7 11:43
 */
public class DifferentSymbolsNaive {
    int differentSymbolsNaive(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!list.contains(c)){
                list.add(c);
            }
        }
        return list.size();
    }
}
