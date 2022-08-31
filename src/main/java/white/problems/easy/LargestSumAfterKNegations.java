package white.problems.easy;

import java.util.Arrays;

public class LargestSumAfterKNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<0&&k>0){
                nums[i] = -nums[i];
                k--;
            }
            sum = sum + nums[i];
        }
        Arrays.sort(nums);
        if (k>0){
            if (k%2==0)
                return sum;
            else
                return sum-2*nums[0];
        }
        return sum;
    }
}
