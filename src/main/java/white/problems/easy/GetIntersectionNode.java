package white.problems.easy;

import white.problems.utils.ListNode;

public class GetIntersectionNode {
    public static void main(String[] args) {
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);
        ListNode a3 = new ListNode(8);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        b1.next = b2;
        b2.next = b3;
        b3.next = a3;
        ListNode intersectionNode = getIntersectionNode(a1, b1);
        System.out.println(intersectionNode.val);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        ListNode big, small;
        int countA = 0;
        int countB = 0;
        int count = 0;
        while (p != null) {
            countA++;
            p = p.next;
        }
        while (q != null) {
            countB++;
            q = q.next;
        }
        big = countA > countB ? headA : headB;
        small = big == headA ? headB : headA;
        count = Math.abs(countA-countB);
        while (count>0){
            big = big.next;
            count--;
        }
        while (small!=big){
            small = small.next;
            big = big.next;
        }
        return big;


    }
}
