package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        if (root == null) return level;
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            while (size>0){
                TreeNode node = queue.poll();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                size--;
            }
            level++;
        }
        return level;
    }
}
