package white.problems.medium;

import white.problems.utils.TreeNode;

public class Rob2 {
    public static int rob(TreeNode root){
        int[] res = robAction1(root);
        return Math.max(res[0], res[1]);
    }
    public static int[] robAction1(TreeNode root) {
        int[] res = new int[2];
        if (root == null)
            return res;
        int[] left = robAction1(root.left);
        int[] right = robAction1(root.right);
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]); // ?
        res[1] = root.val + left[0] + right[0];
        return res;
    }


}
