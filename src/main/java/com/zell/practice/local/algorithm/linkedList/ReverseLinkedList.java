package com.zell.practice.local.algorithm.linkedList;

import com.zell.practice.local.algorithm.common.CommonUtils;
import com.zell.practice.local.algorithm.common.ListNode;

public class ReverseLinkedList {
    public static ListNode ReverseList(ListNode head) {
        ListNode next = null;
        ListNode pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
       CommonUtils.printNode(ReverseList(CommonUtils.getListNode()));
    }
}
