package com.zell.practice.local.algorithm.common;

public class CommonUtils {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void printNode(ListNode node){
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static TreeNode getTree(){
        TreeNode i = new TreeNode(10);
        TreeNode h = new TreeNode(9);
        TreeNode g = new TreeNode(8);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(7, h, i);
        TreeNode d = new TreeNode(4, null, g);
        TreeNode c = new TreeNode(3, f, null);
        TreeNode b = new TreeNode(2, d, e);
        TreeNode root = new TreeNode(1, b, c);
        return root;
    }

    public static int[] getNums(){
        int[] nums = {5,9,1,7,6,8,2,12};
        return nums;
    }

    public static ListNode getListNode(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        return a;
    }

    public static ListNode getListNodeWithCycle(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;
        return a;
    }

    public static ListNode[] getListNodeList(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(5);

        ListNode d = new ListNode(1);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(4);

        ListNode g = new ListNode(2);
        ListNode h = new ListNode(6);
        ListNode i = new ListNode(7);
        a.next = b;
        b.next = c;

        d.next = e;
        e.next = f;

        g.next = h;
        h.next = i;

        ListNode[] list = {a,d,g};
        return list;
    }

}
