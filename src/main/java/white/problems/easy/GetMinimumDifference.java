package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GetMinimumDifference {
    public  static List<Integer> list = new ArrayList<>();
    public static TreeNode pre;
    public static int min=Integer.MAX_VALUE;
    public static int getMinimumDifference(TreeNode root) {
       /*
       travel(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) -list.get(i-1)<min) min = list.get(i) -list.get(i-1);
        }
        return min;
        */
       /*
       travel1(root);
        return min;
        */
        return travel2(root);
    }
    public static void travel(TreeNode root){
        if (root == null )return;
        travel(root.left);;
        list.add(root.val);
        travel(root.right);
    }
    public static void travel1(TreeNode root){
        if (root == null )return;
        travel(root.left);;
        if (pre!=null){
            min = Math.min(min,root.val-pre.val);
        }
        pre = root;
        travel(root.right);
    }
    public static int travel2(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        TreeNode cur = root;
        int result = Integer.MAX_VALUE;
        while (cur!=null|| !stack.empty()){
            if (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }else {
                cur = stack.pop();
                if (pre!=null){
                    min = Math.min(min,cur.val- pre.val);
                }
                pre = cur;
                cur = cur.right;
            }
        }
        return min;
    }
}
