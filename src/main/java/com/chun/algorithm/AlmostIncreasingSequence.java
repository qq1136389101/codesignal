package com.chun.algorithm;

/**
 * @Author chun
 * @Date 2019/12/26 14:43
 */
public class AlmostIncreasingSequence {

    boolean almostIncreasingSequence(int[] sequence) {
        int left = 0;
        int right = left + 1;
        int len = sequence.length;
        int removeCount = 0;

        while (left < right && right < len){
            if(sequence[left] >= sequence[right]){
                if(left > 0 && sequence[left - 1] >= sequence[right]){
                    if(right < len - 1 && sequence[left] >= sequence[right + 1]){
                        return false;
                    }
                    left ++;
                    right ++;
                }

                removeCount ++;
                if(removeCount > 1){
                    return false;
                }
            }

            left ++;
            right ++;
        }
        return true;
    }

}
