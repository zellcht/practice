package com.zell.practice.algorithm.linkedList;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.ListNode;

public class RemoveElements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return header.next;
    }

    public static void main(String[] args) {
        CommonUtils.printNode(removeElements(CommonUtils.getListNode(), 3));
    }
}
