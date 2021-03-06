package com.zell.practice.local.algorithm.linkedList;

import com.zell.practice.local.algorithm.common.CommonUtils;
import com.zell.practice.local.algorithm.common.ListNode;

public class DetectCycle {
    public static ListNode detectCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        Boolean flag = false;
        while(head != null && walker !=null && runner != null && runner.next != null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        ListNode headwalker = head;
        ListNode crosswalker = walker;

        while(headwalker != crosswalker){
            headwalker = headwalker.next;
            crosswalker = crosswalker.next;
        }
        return crosswalker;

    }

    public static void main(String[] args) {
        System.out.println(detectCycle(CommonUtils.getListNodeWithCycle()).val);
    }
}
