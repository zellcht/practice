package com.zell.practice.algorithm.common;

import com.zell.practice.algorithm.Tree;

public class TreeNode {
    public String val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(String x) { val = x; }
    public TreeNode(String x, TreeNode left, TreeNode right){
        val = x;
        this.left = left;
        this.right = right;
    }
}
