package white.problems.easy;

import white.problems.utils.ListNode;

public class getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        while (k >0){
            p = p.next;
            k--;
        }
        while (p!=null){
            p = p.next;
            head = head.next;
        }
        return head;
    }
}
