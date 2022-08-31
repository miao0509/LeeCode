package white.problems.easy;

import white.problems.utils.ListNode;

import java.util.ArrayList;
import java.util.Arrays;

public class reversePrint {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.add(2);
        a.add(3);
        reversePrint test =new reversePrint();
        int[] ints = test.reversePrint(a);
        System.out.println(Arrays.toString(ints));
    }
    ArrayList<Integer> ans = new ArrayList<>();
    public int[] reversePrint(ListNode head) {
        process(head);
        int[] num = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            num[i] = ans.get(i);
        }
        return num;

    }
    public void  process(ListNode head){
        if (head != null){
            process(head.next);
            ans.add(head.val);
        }
    }
}
