package com.zell.practice.algorithm;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.ListNode;

public class LinkedList {
    public static class Solution {

        public ListNode ReverseList(ListNode head) {
            ListNode next = null;
            ListNode pre = null;
            while(head != null){
                next = head.next;
                head.next = pre;
                pre = head;
                head = next;
            }
            return pre;
        }

    }

    public static void main(String[] args) {
        new Solution().ReverseList(CommonUtils.getListNode());
    }
}
