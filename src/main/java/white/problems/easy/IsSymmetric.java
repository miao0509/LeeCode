package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetric {
    //递归
    public static boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return compare(root.left,root.right);
    }
    public static boolean compare(TreeNode left,TreeNode right){
        if (left==null&&right==null) return true;
        if (right==null||left==null) return false;
        if (left.val!=right.val) return false;
        return compare(left.left,right.right)&&compare(left.right,right.left);
    }
    //迭代
    public static boolean isSymmetric2(TreeNode root) {
        if (root==null) return true;
        return compare2(root.left,root.right);
    }
    public static boolean compare2(TreeNode left,TreeNode right){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(left);
        queue.add(right);
        while (!queue.isEmpty()){
            TreeNode l = queue.poll();
            TreeNode r = queue.poll();
            if (l==null&&r==null) continue;
            if (l==null||r==null||l.val!=r.val) return false;
            queue.add(l.left);
            queue.add(r.right);
            queue.add(l.right);
            queue.add(r.left);
        }
        return true;
    }

}
