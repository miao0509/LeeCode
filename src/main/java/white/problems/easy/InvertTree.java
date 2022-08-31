package white.problems.easy;

import white.problems.medium.LevelOrder;
import white.problems.utils.TreeNode;

import java.util.List;

public class InvertTree {
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
        invertTree(e);
        List<List<Integer>> lists = LevelOrder.levelOrder(e);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
    public static TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }
    public static void invert(TreeNode root){
        if (root == null) return;
        TreeNode temp ;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}
