package white.problems.medium;

import white.problems.utils.TreeNode;

public class ConstructMaximumBinaryTree {
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        TreeNode node = constructMaximumBinaryTree(nums);
        System.out.println(node.val);
    }
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = build(nums, 0, nums.length);
        return root;
    }
    public static TreeNode build(int[] nums,int left ,int right){
        if (right-left < 1) return null;
        if (right - left == 1) return new TreeNode(nums[left]);
        int max = nums[left];
        int index=left;
        for (int i = left;i<right;i++){
            if (nums[i]>max) {
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);

        root.left = build(nums,left,index);
        root.right = build(nums,index+1,right);
        return root;
    }
}
