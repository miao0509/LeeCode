package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.Stack;

public class HasPathSum {
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
        boolean b = hasPathSum(one, 16);
        System.out.println(b);
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {

        return travel(root, targetSum);
    }

    public static boolean travel(TreeNode root, int targetsum) {
        /*if (p.left == null && p.right == null && sum == 0) return true; //如果每个节点累加再比较 非常麻烦，比如每经过一个节点就递减
        if (p.left == null && p.right == null) return false; //为叶节点 但是不是0；
        if (p.left != null) {
            if (travel(p.left, sum - p.left.val)) return true;
//            return travel(p.left,sum-p.left.val);
        }
        if (p.right != null) {
//            return travel(p.right, sum - p.right.val);
            if (travel(p.right, sum - p.right.val)) {
                return true;
            }

        }
        return false;*/
        if (root == null) return false;
//        Stack<TreeNode> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
        Stack<Object> stack = new Stack<>();
        stack.push(root);
        stack.push(root.val);
        while (!stack.isEmpty()) {
//            int size = stack1.size();
//            for(int i=0;i<size;i++){
            int sum = (int)stack.pop();
            TreeNode node = (TreeNode) stack.pop();
            // 如果该节点是叶子节点了，同时该节点的路径数值等于sum，那么就返回true
            if (node.left == null && node.right == null && sum == targetsum) return true;
            // 右节点，压进去一个节点的时候，将该节点的路径数值也记录下来
            if (node.right != null) {
                stack.push(node.right);
                stack.push(sum + node.right.val);
            }
            // 左节点，压进去一个节点的时候，将该节点的路径数值也记录下来
            if (node.left != null) {
                stack.push(node.left);
                stack.push(sum + node.left.val);
            }
//            }
        }
        return false;

    }

}
