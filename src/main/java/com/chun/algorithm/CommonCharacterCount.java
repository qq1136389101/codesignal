package com.chun.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings, find the number of common characters between them.
 *
 * Example
 *
 * For s1 = "aabcc" and s2 = "adcaa", the output should be
 * commonCharacterCount(s1, s2) = 3.
 *
 * Strings have 3 common characters - 2 "a"s and 1 "c".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string s1
 *
 *     A string consisting of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     1 ≤ s1.length < 15.
 *
 *     [input] string s2
 *
 *     A string consisting of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     1 ≤ s2.length < 15.
 *
 *     [output] integer
 *
 * @Author chun
 * @Date 2019/12/26 17:43
 */
public class CommonCharacterCount {

    /**
     * 找出两个字符串中最短的字符串, 循环短字符串的每个字符，
     * 并从字符串中进行查找，每次查找到相同字符后，保存该字符的下标位置，
     * 下次就从这个下标位置再开始查找
     * 例如：长字符串为 aabac, 已经有两个 a 与短字符串匹配了，
     * 那么存入 indexMap 的就是 {"a" => "2"}. 表示下次再需要找 a 字符时,
     * 从下标为2的的位置开始找起, 即从 b 字符的位置开始找起
     * @param s1
     * @param s2
     * @return
     */
    int commonCharacterCount(String s1, String s2) {
        if(s1.length() > s2.length()){
            String t = s1;
            s1 = s2;
            s2 = t;
        }

        int count = 0;
        Map<String, Integer> indexMap = new HashMap<String, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            String thisChar = s1.substring(i, i + 1);
            int fromIndex = 0;
            if(indexMap.containsKey(thisChar)){
                fromIndex = indexMap.get(thisChar);
            }
            int findedIndex = s2.indexOf(thisChar, fromIndex);
            if(findedIndex != -1){
                indexMap.put(thisChar, findedIndex + 1);
                count ++;
            }else{
                continue;
            }
        }
        return count;
    }

}
