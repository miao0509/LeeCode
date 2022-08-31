package white.problems.medium;

import java.util.Arrays;

public class lengthOfLIS {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(arr));
    }
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                if (dp[i] > ans)
                    ans = dp[i];
            }
        }
        return ans;
    }
}
