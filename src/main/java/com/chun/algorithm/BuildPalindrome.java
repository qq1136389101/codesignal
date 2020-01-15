package com.chun.algorithm;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StringType;

import java.util.Stack;

/**
 * Given a string, find the shortest possible string which can be achieved by adding characters to the end of initial string to make it a palindrome.
 *
 * Example
 *
 * For st = "abcdc", the output should be
 * buildPalindrome(st) = "abcdcba".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string st
 *
 *     A string consisting of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     3 ≤ st.length ≤ 10.
 *
 *     [output] string
 *
 * @Author chun
 * @Date 2020/1/9 11:23
 */
public class BuildPalindrome {

    /**
     * 找出包含最后一个字符的最长回文子串，
     * 找到后，将回文子串前面的字符串翻转后追加到原字符串的末尾
     * @param st
     * @return
     */
    String buildPalindrome(String st) {
        int rightIndex = st.length() - 1;
        for (int i = 0; i < st.length() - 1; i++) {
            if(isPalindrome(st.substring(i))){
                rightIndex = i;
                break;
            }
        }

        StringBuilder stringBuilder = new StringBuilder(st.substring(0, rightIndex)).reverse();
        st += stringBuilder.toString();
        return st;
    }

    /**
     * 判断是否是回文数
     * @param str
     * @return
     */
    private boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }else{
                left++;
                right--;
            }
        }
        return true;
    }
}
