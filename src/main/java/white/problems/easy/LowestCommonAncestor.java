package white.problems.easy;

import white.problems.utils.TreeNode;

//二叉搜索树
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode travel = travel(root, p, q);
        return travel;
    }
    public TreeNode travel(TreeNode root, TreeNode p, TreeNode q){
        if (root == null) return root;
        if (root.val>=p.val&&root.val<=q.val||root.val<=p.val&&root.val>=q.val)return root;
        TreeNode left = travel(root.left,p,q);
        if (left!=null ) return left;
        TreeNode right = travel(root.right,p,q);
        if (right!=null) return right;
        return null;
    }
}
