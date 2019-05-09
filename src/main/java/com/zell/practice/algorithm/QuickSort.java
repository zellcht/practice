package com.zell.practice.algorithm;

import java.util.Arrays;

public class QuickSort {
    private static int[] quickSort(int[] nums){
        sort(nums, 0, nums.length - 1);
        return nums;
    }

    private static int divide(int[] nums, int start, int end){
        int pivot = nums[start];
        while(start < end){
            while(start < end && nums[end] >= pivot){
                end--;
            }
            if(start < end){
                Common.swap(nums, start, end);
                start++;
            }
            while(start < end && nums[start] <= pivot){
                start++;
            }
            if(start < end){
                Common.swap(nums, start, end);
                end--;
            }
        }
        return start;
    }

    private static void sort(int[] nums, int start, int end){
        if(start > end){
            return;
        }
        int mid = divide(nums, start, end);
        sort(nums, start, mid - 1);
        sort(nums, mid + 1, end);
    }

    private static void findTopK(int[] nums, int start, int end, int k){
        if(start < end){
            int mid = divide(nums, start ,end);
            int len = mid - start + 1;
            if(len == k){
                return;
            } else if(len < k) {
                findTopK(nums, mid + 1, end, k -len);
            } else {
                findTopK(nums, start, mid -1, k);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,9,1,7,6,8,2,12};
        System.out.println(Arrays.toString(quickSort(nums)));
        //findTopK(nums, 0 ,nums.length -1 , 6);
       // System.out.println(Arrays.toString(nums));
    }
}
