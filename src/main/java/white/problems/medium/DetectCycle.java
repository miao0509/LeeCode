package white.problems.medium;
import white.problems.utils.ListNode;
public class DetectCycle {
    public static void main(String[] args) {
        ListNode a4 = new ListNode(-4);
        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(0);
        a1.next = a2;
        a2.next =a3;
        a3.next = a4;
        a4.next = a2;
        ListNode listNode = detectCycle(a1);
        if (listNode!=null) System.out.println(listNode.val);

    }
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {// 有环
                ListNode index1 = fast;
                ListNode index2 = head;
                // 两个指针，从头结点和相遇结点，各走一步，直到相遇，相遇点即为环入口
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }
}
