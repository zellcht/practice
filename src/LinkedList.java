public class LinkedList {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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

        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        new Solution().ReverseList(a);
        while (e != null) {
            System.out.println(e.val);
            e = e.next;
        }
    }
}
