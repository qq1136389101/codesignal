package com.chun.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * Given array of integers, remove each kth element from it.
 *
 * Example
 *
 * For inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] and k = 3, the output should be
 * extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10].
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer inputArray
 *
 *     Guaranteed constraints:
 *     5 ≤ inputArray.length ≤ 15,
 *     -20 ≤ inputArray[i] ≤ 20.
 *
 *     [input] integer k
 *
 *     Guaranteed constraints:
 *     1 ≤ k ≤ 10.
 *
 *     [output] array.integer
 *         inputArray without elements k - 1, 2k - 1, 3k - 1 etc.
 *
 * @Author chun
 * @Date 2020/1/7 11:22
 */
public class ExtractEachKth {
    int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if((i + 1) % k == 0){
                continue;
            }
            list.add(inputArray[i]);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
