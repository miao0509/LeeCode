package white.problems.medium;

public class Change {
    public static void main(String[] args) {
        Change test = new Change();
        int[] coins = {1, 2, 5};
        test.change2(5, coins);
    }
    // 二维数组
    public int change(int amount, int[] coins) {
        int count = 0;
        if (amount == 0) return 1;
        int[][] dp = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0) dp[0][i] = 1;
            else dp[0][i] = 0;
        }
        for (int i = 1; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j - coins[i] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[coins.length - 1][amount]);

        return count;
    }
    // 一维数组  组合数
    public int change1(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        System.out.println(dp[amount]);
        return dp[amount];
    }

    // 一维数组 排列数
    public int change2(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int j =1; j <= amount; j++) {
            for (int i = 0; i < coins.length; i++) {
                if (j - coins[i] >=0)
                    dp[j] = dp[j] + dp[j-coins[i]];
            }
        }
        System.out.println(dp[amount]);
        return dp[amount];
    }
}
