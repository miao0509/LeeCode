package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.*;

public class LevelOrder {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        e.left=d;
        e.right=f;
        d.left=a;
        d.right=b;
        List<List<Integer>> lists = levelOrder(e);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        TreeNode p;
        if (root!=null) queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int len = queue.size();
            while (len>0) {
                p = queue.poll();
                level.add(p.val);
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
                len--;
            }
            ans.add(level);
        }
        Collections.reverse(ans);
        return ans;
    }
}
