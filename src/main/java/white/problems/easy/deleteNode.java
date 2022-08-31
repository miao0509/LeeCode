package white.problems.easy;

import white.problems.utils.ListNode;

public class deleteNode {
    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode p = head;
        while (p.next.val !=val){
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
