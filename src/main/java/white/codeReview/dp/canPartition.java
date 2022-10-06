package white.codeReview.dp;

import java.util.Arrays;

public class canPartition {
    public static boolean canPartition(int[] nums) {

        if(!(Arrays.stream(nums).sum() % 2==0)){
            return false;
        }
        int sum = Arrays.stream(nums).sum() / 2 ;
        int[] dp = new int[sum+1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = sum; j >=nums[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j - nums[i]]+nums[i]);
            }
        }
        return dp[sum] == sum;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        System.out.println(canPartition(nums));
    }
}
