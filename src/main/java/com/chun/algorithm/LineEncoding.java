package com.chun.algorithm;

/**
 * Given a string, return its encoding defined as follows:
 *
 *     First, the string is divided into the least possible number of disjoint substrings consisting of identical characters
 *         for example, "aabbbc" is divided into ["aa", "bbb", "c"]
 *     Next, each substring with length greater than one is replaced with a concatenation of its length and the repeating character
 *         for example, substring "bbb" is replaced by "3b"
 *     Finally, all the new strings are concatenated together in the same order and a new string is returned.
 *
 * Example
 *
 * For s = "aabbbc", the output should be
 * lineEncoding(s) = "2a3bc".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string s
 *
 *     String consisting of lowercase English letters.
 *
 *     Guaranteed constraints:
 *     4 ≤ s.length ≤ 15.
 *
 *     [output] string
 *         Encoded version of s.
 *
 * @Author chun
 * @Date 2020/1/15 17:24
 */
public class LineEncoding {
    String lineEncoding(String s) {
        StringBuilder resultContext = new StringBuilder();
        char thisChar = 0;
        int thisCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == thisChar){
                thisCount++;
            }else{
                addSubString(resultContext, thisCount, thisChar);
                thisChar = s.charAt(i);
                thisCount = 1;
            }
        }

        addSubString(resultContext, thisCount, thisChar);
        return resultContext.toString();
    }

    /**
     * 添加子串
     *
     * @param resultContext 结果容器
     * @param count 字符数量
     * @param character 字符
     */
    private void addSubString(StringBuilder resultContext, int count, char character){
        if(count > 0){
            if(count > 1){
                resultContext.append(count);
            }
            resultContext.append(character);
        }
    }
}
