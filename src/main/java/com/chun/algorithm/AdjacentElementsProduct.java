package com.chun.algorithm;

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 *
 * Example
 *
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be
 * adjacentElementsProduct(inputArray) = 21.
 *
 * 7 and 3 produce the largest product.
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer inputArray
 *
 *     An array of integers containing at least two elements.
 *
 *     Guaranteed constraints:
 *     2 ≤ inputArray.length ≤ 10,
 *     -1000 ≤ inputArray[i] ≤ 1000.
 *
 *     [output] integer
 *         The largest product of adjacent elements.
 *
 * @Author chun
 * @Date 2019/12/25 16:31
 */
public class AdjacentElementsProduct {

    int adjacentElementsProduct(int[] inputArray) {
        int maxProduct = inputArray[0] * inputArray[1];
        for (int i = 1; i < inputArray.length - 1; i++) {
            maxProduct = Math.max(inputArray[i] * inputArray[i + 1], maxProduct);
        }
        return maxProduct;
    }
}




















