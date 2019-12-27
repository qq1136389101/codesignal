package com.chun.algorithm;

/**
 * Several people are standing in a row and need to be divided into two teams. The first person goes into team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
 *
 * You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of team 1, and the second element is the total weight of team 2 after the division is complete.
 *
 * Example
 *
 * For a = [50, 60, 60, 45, 70], the output should be
 * alternatingSums(a) = [180, 105].
 *
 * Input/Output
 *
 *     [execution time limit] 3 seconds (java)
 *
 *     [input] array.integer a
 *
 *     Guaranteed constraints:
 *     1 ≤ a.length ≤ 105,
 *     45 ≤ a[i] ≤ 100.
 *
 *     [output] array.integer
 *
 * @Author chun
 * @Date 2019/12/27 11:48
 */
public class AlternatingSums {

    int[] alternatingSums(int[] a) {
        int team1Count = 0;
        int team2Count = 0;

        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            if(flag){
                team1Count += a[i];
            }else{
                team2Count += a[i];
            }
            flag = !flag;
        }
        
        return new int[]{team1Count, team2Count};
    }
}
