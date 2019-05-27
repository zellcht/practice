package com.zell.practice.local.algorithm.tree;

import com.zell.practice.local.algorithm.common.TreeNode;

public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null){
            return null;
        }
        return buildTree(nums, 0, nums.length - 1);
    }
    public static TreeNode buildTree(int[] nums, int start, int end){
        if(end < start){
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = buildTree(nums, start, mid - 1);
        node.right = buildTree(nums, mid + 1, end);
        return node;
    }
}
