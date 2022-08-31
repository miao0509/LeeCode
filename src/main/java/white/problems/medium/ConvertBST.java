package white.problems.medium;

import white.problems.utils.TreeNode;

public class ConvertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
            if (root==null) return null ;
            travel(root);
            return root;
        }
        public void travel(TreeNode root){
            if (root==null) return ;
            travel(root.right);
            root.val = root.val + sum;
            sum = root.val;
            travel(root.left);
        }
}
