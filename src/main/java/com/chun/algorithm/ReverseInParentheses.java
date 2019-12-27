package com.chun.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Write a function that reverses characters in (possibly nested) parentheses in the input string.
 *
 * Input strings will always be well-formed with matching ()s.
 *
 * Example
 *
 *     For inputString = "(bar)", the output should be
 *     reverseInParentheses(inputString) = "rab";
 *     For inputString = "foo(bar)baz", the output should be
 *     reverseInParentheses(inputString) = "foorabbaz";
 *     For inputString = "foo(bar)baz(blim)", the output should be
 *     reverseInParentheses(inputString) = "foorabbazmilb";
 *     For inputString = "foo(bar(baz))blim", the output should be
 *     reverseInParentheses(inputString) = "foobazrabblim".
 *     Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] string inputString
 *
 *     A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all parentheses in inputString form a regular bracket sequence.
 *
 *     Guaranteed constraints:
 *     0 ≤ inputString.length ≤ 50.
 *
 *     [output] string
 *         Return inputString, with all the characters that were in parentheses reversed.
 *
 * @Author chun
 * @Date 2019/12/27 10:00
 */
public class ReverseInParentheses {

    String reverseInParentheses(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != ')'){
                stack.push(inputString.charAt(i));
            }else{
                List<Character> tmp = new ArrayList<>();
                while (stack.peek() != '('){
                    tmp.add(stack.pop());
                }
                stack.pop();
                for (int i1 = 0; i1 < tmp.size(); i1++) {
                    stack.push(tmp.get(i1));
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.reverse().toString();
    }
}
