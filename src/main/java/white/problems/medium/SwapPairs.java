package white.problems.medium;

import white.problems.utils.ListNode;

public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        if (head.next == null) return head;
        ListNode p = head;
        ListNode q = head.next;
        ListNode head2 = q;
        while (p.next != null && q.next != null) {
            p.next = q.next;
            p = p.next;
            q.next = p.next;
            q = q.next;
        }
        p.next = null;

        p = head;
        q = head2;
        ListNode p1, q1, temp = null;
        while (p != null && q != null) {
            p1 = p.next;
            q1 = q.next;
            q.next = p;
            p.next = q1;
            temp = p;
            p = p1;
            q = q1;
        }
        if (p != null) {
            temp.next = p;
        }

        return head2;
    }
}
