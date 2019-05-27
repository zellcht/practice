package com.zell.practice.local.algorithm.sorts;

import com.zell.practice.local.algorithm.common.CommonUtils;

import java.util.Arrays;

public class SelectionSort {
    private static int[] selectionSort(int[] nums){
        if(nums.length == 0){
            return nums;
        }
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if(nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            CommonUtils.swap(nums, minIndex, i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {5,9,1,7,6,8,2,12};
        System.out.println(Arrays.toString(selectionSort(nums)));
        int i = 1;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}
