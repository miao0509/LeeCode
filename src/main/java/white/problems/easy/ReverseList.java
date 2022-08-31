package white.problems.easy;

import white.problems.utils.ListNode;

public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.add(2);
        head.add(3);
        head.add(4);
        head.add(5);
        ListNode listNode = rev(head,null);
        listNode.print();
    }
    public static ListNode reverseList(ListNode head) {
        if (head ==null) return head;
        ListNode p = new ListNode();
        p.next = null;
        ListNode q = head;
        while(q!=null){
            ListNode r = q.next;
            q.next = p.next;
            p.next = q;
            q = r ;
        }
       /* q.next = p.next;
        p.next = q;*/
        return p.next;
    }
    public static ListNode reverse(ListNode head){
        ListNode pre = null,cur = null,p = head;
        while (p!=null){
            pre = p;
            p = p.next;
            pre.next = cur;
            cur= pre;
        }
        return pre;
    }

    public static ListNode rev(ListNode head,ListNode pre){
        if (head == null) return pre;
        ListNode next = head.next;
        head.next = pre;
        return  rev(next,head);

    }
}
