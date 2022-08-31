package white.problems.easy;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow++] = nums[fast];
            }
        }
        // 后面的元素全变成 0
        for (int j = slow; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}
