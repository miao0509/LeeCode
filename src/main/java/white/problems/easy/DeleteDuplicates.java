package white.problems.easy;

import white.problems.utils.ListNode;

public class DeleteDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode next = head.next;
        ListNode p = head;
        while (next!=null){
            if (p.val==next.val){
                p.next = next.next;
                next = next.next;
            }else {
                p = next;
                next = p.next;
            }
        }
        return head;
    }
}
