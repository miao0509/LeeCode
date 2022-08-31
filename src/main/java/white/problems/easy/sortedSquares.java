package white.problems.easy;

import java.util.Arrays;

public class sortedSquares {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] ints = sortedSquares2(nums);
        for (int anInt : ints) {
            System.out.print(anInt+" ");
        }
    }
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    public static int[] sortedSquares2(int[] nums) {
        int max = Math.abs(nums[0]);
        for (int num : nums) {
            if (Math.abs(num) > max) max = Math.abs(num);
        }
        int[] a = new int[max+1];
        for (int i = 0; i < max; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            a[Math.abs(nums[i])] += 1;
        }
        for (int i = 0, j = 0; i < a.length && j < nums.length; i++) {
            if (a[i] != 0) {
                for (int k = 0; k < a[i]; k++) {
                    nums[j++] = i * i;
                }
            }
        }
        return nums;
    }
}
