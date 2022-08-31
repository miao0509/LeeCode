package white.problems.medium;

import white.problems.utils.TreeNode;

public class flatten {
    public static void main(String[] args) {
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);

        p1.right = p2;
        p2.left = p3;
        flatten(p1);
        System.out.println("1");

    }
    public static void flatten(TreeNode root) {
       process(root);
    }
    public static void process (TreeNode root){
        if (root!=null){
            TreeNode left = root.left;
            TreeNode right = root.right;
            if (left !=null) root.right = left;
            root.left = null;
            if (left !=null) {
                TreeNode last = find_last(left, left);
                last.right = right;
            }

            process(root.right);
        }
    }

    public static TreeNode find_last(TreeNode root,TreeNode last ){
        if (root !=null){
            last = root;
            last = find_last(root.left,last);
            last = find_last(root.right,last);
        }
        return last;
    }
    public static void flatten1(TreeNode root) {
        TreeNode cur = root;
        while (cur !=null){
            if (cur.left !=null){
                TreeNode next = cur.left;
                TreeNode pre = next;
                while (pre.right!=null) pre = pre.right;
                pre.right = cur.right;
                cur.left = null;
                cur.right = next;

            }
            cur = cur.right;
        }
    }
}
