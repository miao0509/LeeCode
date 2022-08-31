package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        Queue<Object> queue = new LinkedList<>();
        queue.add(root);
        queue.add(0);
        int sum = 0;
        while (!queue.isEmpty()) {
            TreeNode p = (TreeNode) queue.poll();
            int flag = (int) queue.poll();
            if (flag==1&&p.left==null&&p.right==null){
                sum = sum+p.val;
                continue;
            }
            if (p.left != null) {
                queue.add(p.left);
                queue.add(1);
            }
            if (p.right != null) {
                queue.add(p.right);
                queue.add(0);
            }
        }
        return sum;
    }
}
