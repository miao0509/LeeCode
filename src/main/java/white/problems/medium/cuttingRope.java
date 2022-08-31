package white.problems.medium;

public class cuttingRope {
    public static void main(String[] args) {
        System.out.println(cuttingRope(120));
    }

    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                //不切  切两半   切两次以上
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, j * dp[i - j]));
            }
        }
        return dp[n];
    }

    public static int cuttingRope1(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        long res = 1;
        while (n > 4) {
            res *= 3;
            res = res % 1000000007;
            n -= 3;
        }
        return (int) (res * n % 1000000007);
    }

}
