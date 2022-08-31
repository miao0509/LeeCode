package white.problems.medium;

import white.problems.utils.TreeNode;

public class BuildTree {
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return travel(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    public static TreeNode travel(int[] inorder, int inLeft,int inRight,int[] postorder,int postLeft,int postRight){
        if (inRight-inLeft<1) return null;
        if (inRight-inLeft==1) return new TreeNode(inorder[inLeft]);
        int rootVal = postorder[postRight -1];
        TreeNode root = new TreeNode(rootVal);
        int index;
        for (index = inLeft;index<inorder.length;index++){
            if (inorder[index]==rootVal) break;
        }
        root.left = travel(inorder,inLeft,index,postorder,postLeft,postLeft+index-inLeft);
        root.right = travel(inorder,index+1,inRight,postorder,postLeft+index-inLeft,postRight-1);
        return root;
    }
}
