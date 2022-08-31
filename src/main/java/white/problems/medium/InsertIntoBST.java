package white.problems.medium;

import white.problems.utils.TreeNode;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        buildBst(root,val);
        return root;
    }
    public TreeNode buildBst(TreeNode root,int val){
        if (root == null ) return new TreeNode(val);
        if (val<root.val) root.left=buildBst(root.left,val);
        if (val>root.val) root.right=buildBst(root.right,val);
        return root;
    }
}
