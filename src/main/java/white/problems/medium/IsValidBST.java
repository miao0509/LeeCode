package white.problems.medium;

import white.problems.utils.TreeNode;

public class IsValidBST {
    public static void main(String[] args) {
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        five.left = four;
        five.right = six;
        six.left = three;
        six.right = seven;
        boolean validBST = isValidBST(five);
        System.out.println(validBST);
    }
    static  TreeNode max;
    public static boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = isValidBST(root.left);
        if (!left) return false;
        if (max!=null&&root.val<=max.val) return false;
        max = root;
        boolean right = isValidBST(root.right);
        return right;
    }
}
