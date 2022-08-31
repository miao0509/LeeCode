package white.problems.easy;

import white.problems.utils.ListNode;

public class RemoveElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.add(1);
        head.add(1);
        ListNode listNode = removeElements(head, 1);
        listNode.print();
    }
    public static ListNode removeElements(ListNode head, int val) {
        if (head==null) return head;
        ListNode h = new ListNode();
        h.next = head;
        delete(h,val);
        return h.next;
    }
    public static void delete(ListNode head,int val){
        if (head.next ==null) return;
        if (head.next.val ==val){
            head.next = head.next.next;
            delete(head,val);
        }else {
            delete(head.next,val);
        }
    }
}
