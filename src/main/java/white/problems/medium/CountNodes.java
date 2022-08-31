package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {
    public static int countNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        TreeNode p;
        if (root!=null) queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            count +=len;
            while (len > 0) {
                p = queue.poll();
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
                len--;
            }
        }
        return count;
    }
}
