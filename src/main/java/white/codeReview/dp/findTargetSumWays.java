package white.codeReview.dp;

import java.util.Arrays;

public class findTargetSumWays {
    public static int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if ((sum + target) % 2 == 1 || Math.abs(target) > sum) return 0;
        int tag = (sum + target) / 2;
        int[] dp = new int[tag + 1 ];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = tag; j >= nums[i] ; j--) {
                dp[j] +=dp[j-nums[i]];
            }
        }
        return dp[tag];
    }

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1},3));
    }
}
