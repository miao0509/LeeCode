package white.problems.medium;

/**
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须 原地 修改，只允许使用额外常数空间。
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 *
 * 将数组从后往前查找一个较大的数和一个最靠近右边的较小的数，交换位置，再从右边开始升序排序
 */
public class nextPermutation {
    public static void process(int[] nums){
        int i = nums.length - 2;
        //找到最靠右的逆序对
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //不是最大的情况
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

}
