package white.problems.medium;

import white.problems.utils.TreeNode;

public class DeleteNode {
    public static void main(String[] args) {
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        five.left = three;
        five.right = six;
        three.left = two;
        three.right = four;
        six.right = seven;
        TreeNode node = deleteNode(five, 6);

    }
    //将要删除节点的左孩子放到右子树最左边，然后返回要删除节点的右孩子，相当于删除了节点
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root==null) return null;
        if (root.val==key){
            if(root.left==null&&root.right==null) return null;
            else if (root.left==null){
                root  = root.right;
                return root;
            }else if (root.right==null){
                root  = root.left;
                return root;
            }else {
                TreeNode temp = root.right;
                while (temp.left !=null) temp = temp.left;
                temp.left = root.left;
                root = root.right;
                return root;
            }
        }
        if (root.val>key) root.left = deleteNode(root.left,key);
        if (root.val<key) root.right = deleteNode(root.right,key);
        return root;
    }
    //要删除节点和右子树最左边节点交换值 然后删除右子树最左边节点
    private TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key) {
            root.left = delete(root.left,key);
        } else if (root.val < key) {
            root.right = delete(root.right,key);
        } else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode tmp = root.right;
            while (tmp.left != null) {
                tmp = tmp.left;
            }
            root.val = tmp.val;
            root.right = delete(root.right,tmp.val);
        }
        return root;
    }
}
