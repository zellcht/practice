package com.zell.practice.algorithm.linkedList;

import com.zell.practice.algorithm.common.CommonUtils;
import com.zell.practice.algorithm.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeKlists {
    public static ListNode mergeKLists(ListNode[] lists) {
        return partition(lists, 0 ,lists.length - 1);
    }
    public static ListNode partition(ListNode[] lists, int start,int end){
        if(start == end){
            return lists[start];
        }
        if(start < end){
            int len = (start + end) / 2;
            ListNode l1 = partition(lists, start, len);
            ListNode l2 = partition(lists, len + 1, end);
            return mergeTwoLists(l1,l2);
        } else {
            return null;
        }
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }
        else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        CommonUtils.printNode( MergeKlists.mergeKLists(CommonUtils.getListNodeList()));
        List<? extends Number> foo1 = new ArrayList<Integer>();
    }
}
