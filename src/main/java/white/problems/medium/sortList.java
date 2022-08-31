package white.problems.medium;

import white.problems.utils.ListNode;

public class sortList {
    public static void main(String[] args) {
        ListNode p1 = new ListNode(4);
        p1.add(2);
        p1.add(1);
        p1.add(6);
        p1.add(10);
        p1.add(5);
        ListNode listNode = sortList1(p1);

    }
    // 超时
    public static ListNode sortList(ListNode head) {
        if (head == null) return head;
        ListNode phead = new ListNode();
        ListNode next = head.next;
        phead.next = head;
        head.next = null;
        while (next !=null){
            ListNode cur = next;
            next = next.next;
            cur.next = null;;
            addNode(phead,cur);
        }
        return phead.next;

    }

    private static void addNode(ListNode head, ListNode cur) {
        while (head.next !=null&&head.next.val<cur.val ){
            head = head.next;
        }
        cur.next = head.next;
        head.next = cur;
    }
    public static ListNode sortList1(ListNode head) {
        return sortList1(head,null);
    }

    private static ListNode sortList1(ListNode head, ListNode tail) {
        if (head == null) return head;
        if (head.next == tail) {
            head.next = null;
            return head;
        }
        ListNode fast = head,slow = head;
        while (fast != tail) {
            slow = slow.next;
            fast = fast.next;
            if (fast != tail) {
                fast = fast.next;
            }
        }
        ListNode mid = slow;
        ListNode list1 = sortList1(head,mid);
        ListNode list2 = sortList1(mid,tail);
        ListNode sort = merge(list1,list2);
        return sort;

    }
    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head,temp1= list1,temp2= list2;
        while (temp1!=null&&temp2!=null){
            if (temp1.val <temp2.val){
                temp.next = temp1;
                temp1 =temp1.next;
            }else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp =temp.next;
        }
        if (temp1!=null) temp.next=temp1;
        if (temp2!=null) temp.next=temp2;
        return head.next;
    }
}
