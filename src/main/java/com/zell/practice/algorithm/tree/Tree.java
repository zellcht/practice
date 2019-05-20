package com.zell.practice.algorithm.tree;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    public static void preOrder(TreeNode root) {
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void bfs(TreeNode root) {
        ArrayDeque<TreeNode> queue =new ArrayDeque<TreeNode>();
        if(root == null){
            return;
        }
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove();
            System.out.println(node.val);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
    }

    public static void dfs(TreeNode root) {
        ArrayDeque<TreeNode> stack =new ArrayDeque<TreeNode>();
        if(root == null){
            return;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if(node.right != null){
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }

    public static int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left) + 1;
        int right = maxDepth(root.right) + 1;
        return left > right ? left : right;
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        List<List<Integer>> list = new ArrayList<>();

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            while(size > 0){
                TreeNode node = queue.remove();
                subList.add(node.val);
                if(node.left !=null){
                    queue.add(node.left);

                }
                if(node.right !=null){
                    queue.add(node.right);
                }
                size--;
            }
            if(!subList.isEmpty()){
                list.add(subList);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = CommonUtils.getTree();
        preOrder(root);
        System.out.println("======BFS=======");
        bfs(root);
        System.out.println("======DFS=======");
        dfs(root);
        levelOrder(root);
    }
}
