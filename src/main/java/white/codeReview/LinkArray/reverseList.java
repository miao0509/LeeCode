package white.codeReview.LinkArray;

import white.problems.utils.ListNode;

public class reverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (q != null){
            ListNode r = q.next;
            q.next = p;
            p = q ;
            q = r;
        }
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseList(ListNode.creatArr(arr)).print();

    }
}
