package com.zell.practice.local.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static  List<List<Integer>> subsets (int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < 1 << length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                if ((i & (1 << j)) != 0){
                    list.add(nums[j]);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,7,8,9};
        System.out.println(subsets(nums));
        char[] s = {'a','c','i','d'};
    }
}
