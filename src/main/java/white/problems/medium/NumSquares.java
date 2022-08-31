package white.problems.medium;

public class NumSquares {
    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
    public static int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i * i <= n; i++) {//物品
            for (int j = i *i ; j <= n; j++) {//背包
                if (dp[j - i * i] != Integer.MAX_VALUE)
                    dp[j] = Math.min(dp[j], dp[j - i * i ] + 1);
            }
        }
        return dp[n];
    }
}
