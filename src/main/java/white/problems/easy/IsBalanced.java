package white.problems.easy;

import white.problems.utils.TreeNode;

public class IsBalanced {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        int def = Math.abs(left-right);
        if (def >= 2 ) return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    public static int getDepth(TreeNode p){
        if (p ==null) return 0;
        int left = getDepth(p.left);
        int right =getDepth(p.right);
        int depth = 1 + Math.max(left,right);
        return depth;
    }


}
