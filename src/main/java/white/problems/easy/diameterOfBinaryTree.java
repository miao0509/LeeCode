package white.problems.easy;

import white.problems.utils.TreeNode;

public class diameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3= new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t5.left = t6;
        diameterOfBinaryTree test = new diameterOfBinaryTree();
        System.out.println(test.diameterOfBinaryTree(t1));
    }
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        process(root);
        return max;
    }

    public int process(TreeNode root){
        if (root==null) return 0;
        int left = process(root.left);
        int right = process(root.right);
        max = Math.max(left+right,max);
        return Math.max(left,right)+1;
    }
    //-----------------------------
    //自己的错误代码,因为最长的直径可能不是根节点的左右，而是某个中间节点的左右。
    public int diameterOfBinaryTree1(TreeNode root) {
        int left = process(root.left);
        int right = process(root.right);
        return left+right;
    }

    public int process1(TreeNode root){
        if (root==null) return 0;
        int left = process(root.left);
        int right = process(root.right);

        return Math.max(left,right)+1;
    }
}
