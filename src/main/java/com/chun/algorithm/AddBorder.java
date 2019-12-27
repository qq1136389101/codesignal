package com.chun.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
 *
 * Example
 *
 * For
 *
 * picture = ["abc",
 *            "ded"]
 *
 * the output should be
 *
 * addBorder(picture) = ["*****",
 *                       "*abc*",
 *                       "*ded*",
 *                       "*****"]
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.string picture
 *
 *     A non-empty array of non-empty equal-length strings.
 *
 *     Guaranteed constraints:
 *     1 ≤ picture.length ≤ 100,
 *     1 ≤ picture[i].length ≤ 100.
 *
 *     [output] array.string
 *         The same matrix of characters, framed with a border of asterisks of width 1.
 *
 * @Author chun
 * @Date 2019/12/27 11:56
 */
public class AddBorder {

    String[] addBorder(String[] picture) {
        String[] res = new String[picture.length + 2];
        int len = picture[0].length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len + 2; i++) {
            stringBuilder.append("*");
        }
        res[0] = stringBuilder.toString();
        res[picture.length + 1] = stringBuilder.toString();
        for (int i = 0; i < picture.length; i++) {
            res[i+1] = "*" + picture[i] + "*";
        }
        return res;
    }
}
