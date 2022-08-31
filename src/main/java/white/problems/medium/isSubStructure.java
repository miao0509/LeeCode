package white.problems.medium;

import white.problems.utils.TreeNode;

public class isSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) return false;
        return is(A,B)||isSubStructure(A.left,B)||isSubStructure(A.right,B);
    }

    public boolean is(TreeNode A, TreeNode B) {
        if(B == null) return true;
        if(A == null) return false;
        if (A.val != B.val) return false;
        Boolean left = is(A.left, B.left);
        Boolean right = is(A.right, B.right);
        return left && right;

    }
}
