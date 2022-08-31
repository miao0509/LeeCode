package white.problems.easy;

import white.problems.utils.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class TwoNumSum {
    private ListNode listNode;


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int L1Sum=0;
        int L2Sum=0;
        while (l1.next!=null){
            L1Sum+=l1.val;
        }
        while (l2.next!=null){
            L2Sum+=l2.val;
        }
        return null;
    }
}
