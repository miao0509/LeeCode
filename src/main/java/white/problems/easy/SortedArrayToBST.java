package white.problems.easy;

import white.problems.utils.TreeNode;

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode build = build(nums, 0, nums.length);
        return build;
    }
    public TreeNode build (int[] nums,int left,int right){
        if (left>=right) return null;
        if (right-left == 1) return new TreeNode(nums[left]);
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums,left,mid);
        root.right = build(nums,mid+1,right);
        return root;
    }
}
