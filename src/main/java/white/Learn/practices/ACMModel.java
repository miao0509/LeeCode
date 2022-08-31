package white.Learn.practices;

import white.problems.utils.TravelTree;
import white.problems.utils.TreeNode;

import java.util.List;

public class ACMModel {
    public static void main(String[] args) {
        int[] ar = {4,1,6,0,2,5,7,-1,-1,-1,3,-1,-1,-1,8};
        /*TreeNode[] tree = new TreeNode[ar.length];
        TreeNode root = null;
        for (int i = 0; i < ar.length ; i++) {
            TreeNode node = null;
            if (ar[i] != -1) node = new TreeNode(ar[i]);
            if (i == 0) root = node;
            tree[i] = node;
        }
        for (int i = 0; i * 2 + 2  < tree.length ; i++) {
            tree[i].left = tree[i * 2 + 1];
            tree[i].right = tree[i * 2 + 2];
        }*/
        TreeNode treeNode = buildTree(ar);
        List<Integer> integers = TravelTree.preorderTraversal(treeNode);
        List<Integer> integers1 = TravelTree.inorderTraversal(treeNode);
        System.out.println(integers1);
    }

    public static TreeNode buildTree(int[] arr){
        TreeNode[] tree = new TreeNode[arr.length];
        TreeNode root = null;
        if (arr.length==0) return root;
        for (int i = 0; i < arr.length ; i++) {
            TreeNode node = null;
            if (arr[i] != -1) node = new TreeNode(arr[i]);
            if (i == 0) root = node;
            tree[i] = node;
        }
        for (int i = 0; i * 2 + 2  < tree.length ; i++) {
            tree[i].left = tree[i * 2 + 1];
            tree[i].right = tree[i * 2 + 2];
        }
        return tree[0];
    }
}
