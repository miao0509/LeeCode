package white.problems.easy;

import white.problems.utils.ListNode;

public class MergeTwoLists {
    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        ListNode c = new ListNode();
        ListNode p = c;
        while (l1!=null&&l2!=null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 =  l1.next;
            } else {
                p.next = l2;
                l2 =  l2.next;
            }
            p=p.next;
        }
        if (l1 != null) p.next = l1;
        if (l2 != null) p.next = l2;
        return c.next;

    }
}
