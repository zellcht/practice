package com.zell.practice.algorithm.LinkedList;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.ListNode;

public class HasCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while (head != null && walker != null && runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if (walker == runner) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasCycle(CommonUtils.getListNode()));
        System.out.println(hasCycle(CommonUtils.getListNodeWithCycle()));
    }
}
