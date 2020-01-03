package com.chun.algorithm;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Given a string, find out if its characters can be rearranged to form a palindrome.
 *
 * Example
 *
 * For inputString = "aabb", the output should be
 * palindromeRearranging(inputString) = true.
 *
 * We can rearrange "aabb" to make "abba", which is a palindrome.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     A string consisting of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     1 ≤ inputString.length ≤ 50.
 *
 *     [output] boolean
 *         true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 *
 * @Author chun
 * @Date 2019/12/27 15:19
 */
public class PalindromeRearranging {

    /**
     * @param inputString
     * @return
     */
    boolean palindromeRearranging(String inputString) {
        if(inputString == null || inputString.equals("")){
            return false;
        }
        if(inputString.length() == 1){
            return true;
        }

        Set<Character> set = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            if(set.contains(inputString.charAt(i))){
                set.remove(inputString.charAt(i));
            }else{
                set.add(inputString.charAt(i));
            }
        }

        return set.size() <= 1;
    }
}
