package white.problems.medium;

import white.problems.utils.ListNode;

public class RemoveNthFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = new ListNode();
        first.next = head;
        if (head.next==null) return null;
        ListNode p = first;
        ListNode q = first;
        for (int i = 0; i < n; i++) {
            q = q.next;
        }
        while (q.next!=null){
            p = p.next;
            q = q.next;
        }
        p.next =p.next.next;

        return first.next;
    }
}
