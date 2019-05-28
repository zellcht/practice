package com.zell.practice.local.algorithm.sorts;

import com.zell.practice.local.algorithm.common.CommonUtils;

import java.util.Arrays;

public class BubbleSort {
    private static int[] bubbleSort(int[] nums){
        if(nums.length == 0){
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] >  nums[j + 1]){
                    CommonUtils.swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    private static int[] bubbleSortRev(int[] nums){
        if(nums.length == 0){
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if(nums[j] <  nums[j + 1]){
                    CommonUtils.swap(nums, j, j + 1);
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,9,1,7,6,8,2,12};
        System.out.println(Arrays.toString(bubbleSort(nums)));
        System.out.println(Arrays.toString(bubbleSortRev(nums)));
    }
}
