package com.zell.practice.algorithm.linkedList;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.ListNode;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int add = 0;
        int val1 = 0;
        int val2 = 0;
        while (l1 != null || l2 != null) {
            val1 = l1 == null ? 0 : l1.val;
            val2 = l2 == null ? 0 : l2.val;
            int result = (val1 + val2 + add) % 10;
            add = (val1 + val2 + add) / 10;
            l3.next = new ListNode(result);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (add != 0) {
            l3.next = new ListNode(add);
        }
        return head.next;
    }

    public static void main(String[] args) {
        CommonUtils.printNode(addTwoNumbers(CommonUtils.getListNode(), CommonUtils.getListNode()));
    }
}
