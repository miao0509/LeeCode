package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public static void main(String[] args) {
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
        for (List<Integer> integers : pathSum(one, 16)) {
            System.out.println(integers);
        }

    }
    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res; // 非空判断

        List<Integer> path = new LinkedList<>();
        travel(root, targetSum-root.val, res, path);
        return res;
    }
    public static void travel(TreeNode p, int sum , List<List<Integer>> result,List<Integer> path){
        path.add(p.val);
        if (p.left == null && p.right == null && sum == 0) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (p.left!=null){
            travel(p.left,sum-p.left.val,result,path);
            path.remove(path.size()-1);
        }
        if (p.right!=null){
            travel(p.right,sum-p.right.val,result,path);
            path.remove(path.size()-1);
        }
    }
}
