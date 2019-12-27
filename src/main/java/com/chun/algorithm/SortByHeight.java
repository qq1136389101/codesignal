package com.chun.algorithm;

/**
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!
 *
 * Example
 *
 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
 * sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer a
 *
 *     If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
 *
 *     Guaranteed constraints:
 *     1 ≤ a.length ≤ 1000,
 *     -1 ≤ a[i] ≤ 1000.
 *
 *     [output] array.integer
 *         Sorted array a with all the trees untouched.
 *
 * @Author chun
 * @Date 2019/12/27 9:44
 */
public class SortByHeight {

    /**
     * 本质上就是冒泡排序， 当对比的两个数有 -1 时跳过就行
     * @param a
     * @return
     */
    int[] sortByHeight(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] == -1){
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] == -1){
                    continue;
                }
                if(a[i] > a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        return a;
    }
}






















