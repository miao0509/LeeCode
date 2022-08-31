package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepth {
    public static int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int minLevel = 0;
        if (root==null) return minLevel;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            minLevel++;
            while (size>0){
                TreeNode node = queue.poll();
                if (node.left == null&& node.right == null) return minLevel;
                if (node.left!=null) queue.add(node.left);
                if (node.right!=null) queue.add(node.right);
                size--;
            }

        }
        return minLevel;
    }
}
