package white.problems.easy;

import white.problems.utils.ListNode;

public class isPalindrome {
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null, cur = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
            pre.next = cur;
            cur = pre;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (pre != null) {
            if (pre.val != slow.val) return false;
            pre = pre.next;
            slow = slow.next;
        }
        return true;


    }
}
