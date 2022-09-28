package white.codeReview.LinkArray;

import white.problems.utils.ListNode;

public class removeElements {
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        ListNode t = new ListNode(-1,head);
        ListNode p = t;

        while ( p.next != null){
            if ( p.next.val == val){
                 p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return t.next;

    }

    public static void main(String[] args) {
        int[] head = {1,2,6,3,4,5,6};
        ListNode listNode = ListNode.creatArr(head);
        listNode.print();
        removeElements(listNode,6);
        listNode.print();
    }
}
