package white.problems.medium;

import white.problems.utils.TreeNode;

public class BuildTree2 {
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return   build(preorder,inorder,0,preorder.length,0,inorder.length);

    }

    public static TreeNode build(int[] preorder, int[] inorder,int preLeft,int preRight,int inLeft,int inRight){
        if (preRight  - preLeft< 1) return null;
        if (preRight - preLeft ==1){
            return new TreeNode(preorder[preLeft]);
        }
        int  index;
        for ( index = inLeft; index < inRight; index++) {
            if (inorder[index] == preorder[preLeft])
                break;
        }
        TreeNode root = new TreeNode(preorder[preLeft]);
        root.left = build(preorder,inorder,preLeft+1,preLeft+index-inLeft+1,inLeft,index);
        root.right = build(preorder,inorder,preLeft+index-inLeft+1,preRight,index+1,inRight);
        return root;
    }
}
