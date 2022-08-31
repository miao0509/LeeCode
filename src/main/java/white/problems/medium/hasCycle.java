package white.problems.medium;

import white.problems.utils.ListNode;

public class hasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next ==null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow !=fast){
            if (fast ==null ||fast.next==null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
    public boolean hasCycle1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow==fast) return true;
        }
        return false;
    }
}
