package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

    public static void main(String[] args) {
        List<TreeNode> path = new ArrayList<>();
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        one.left = two;
        one.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;
        TreeNode node = lowestCommonAncestor(one, seven, five);
        System.out.println(node.val);

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        List<TreeNode> ans1 = new ArrayList<>();
        List<TreeNode> ans2 = new ArrayList<>();
        travel(root, p, path1,ans1);
        travel(root, q, path2,ans2);
        int i = 0;
        for (; i < ans1.size() && i<ans2.size(); i++) {
            if (ans1.get(i)!=ans2.get(i)) break;
        }
        return ans2.get(i-1);

    }
    public static void travel(TreeNode root, TreeNode target, List<TreeNode> path,List<TreeNode> ans){
        path.add(root);
        if (root == target) {
            ans.addAll(path);
            return ;
        }
        if (root.left!=null) {
            travel(root.left,target,path,ans);
            path.remove(path.size()-1);
        }
        if (root.right!=null){
            travel(root.right,target,path,ans);
            path.remove(path.size()-1);
        }

    }
}
