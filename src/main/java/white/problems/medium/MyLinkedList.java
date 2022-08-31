package white.problems.medium;

import white.problems.utils.ListNode;

public class MyLinkedList {
    private int size;
    private ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode();
    }

    public int get(int index) {
        if (index < 0 || index > size) return -1;
        ListNode cur = head;
        while (index >= 0) {
            cur = cur.next;
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0 ) index = 0;
        size++;
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        ListNode p = new ListNode(val);
        p.next = cur.next;
        cur.next = p;

    }
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }
}
