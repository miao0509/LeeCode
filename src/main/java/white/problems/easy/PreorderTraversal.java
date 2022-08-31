package white.problems.easy;

import white.problems.utils.TravelTree1;
import white.problems.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
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
        TravelTree1 travel = new TravelTree1();
        List<Integer> integers = travel.preorderTraversal(e);
        for (Integer integer : integers) {
            System.out.print( integer + "  ");
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        visit(root, ans);
        return ans;
    }

    public static void visit(TreeNode node, ArrayList<Integer> ans) {
        if (node == null) return;
        ans.add(node.val);
        visit(node.left, ans);
        visit(node.right, ans);
    }
}
