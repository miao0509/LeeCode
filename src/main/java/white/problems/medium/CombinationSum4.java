package white.problems.medium;

public class CombinationSum4 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int i = combinationSum4(nums, 4);
        System.out.println(i);
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int j = 1; j <= target; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (j - nums[i] >= 0) {
                    dp[j] = dp[j] + dp[j - nums[i]];
                }
            }
        }
        return dp[target];
    }

    public static int combinationSum41(int[] nums, int target) {
        int[][] dp = new int[nums.length][target + 1];
        for (int i = 0; i <= target; i++) {
            if (i % nums[0] == 0) dp[0][i] = 1;
            else dp[0][i] = 0;
        }
        dp[0][0] = 1;
        for (int j = 1; j <= target; j++) {
            for (int i = 1; i < nums.length; i++) {
                if (j - nums[i] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - nums[i]];
                }
            }
        }
        return dp[nums.length - 1][target];
    }
}
