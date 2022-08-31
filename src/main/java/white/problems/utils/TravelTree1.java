package white.problems.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 同意非迭代写法
 */
public class TravelTree1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> ans = new ArrayList<>();
        TreeNode p;
        if (root != null) stack.push(root);
        while (!stack.isEmpty()) {
            p = stack.pop();
            if (p != null) {
                if (p.right != null) stack.push(p.right);
                stack.push(p);
                stack.push(null);
                if (p.left != null) stack.push(p.left);

            } else {
                ans.add(stack.pop().val);
            }
        }
        return ans;
    }
}
