package white.problems.easy;

import white.problems.utils.TreeNode;

public class IsSubtree {
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot==null) return true;
        if (root==null) return false;
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)||compare(root,subRoot);
    }
    public static boolean compare(TreeNode root,TreeNode subRoot){
        if (root==null&&subRoot==null) return true;
        if (subRoot==null||root==null) return false;
        if (root.val!=subRoot.val) return false;
        return compare(root.left,subRoot.left)&&compare(root.right,subRoot.right);
    }
}
