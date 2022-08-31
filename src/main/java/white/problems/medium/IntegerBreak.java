package white.problems.medium;

public class IntegerBreak {
    public static void main(String[] args) {
        IntegerBreak test = new IntegerBreak();
        System.out.println(test.integerBreak(10));
    }
    public int integerBreak(int n) {
        int[] dp = new  int[n+1];
        dp[2] = 1;
        for (int i = 3; i <=n; i++) {
            for (int j = 1; j <=i-j ; j++) {
                dp[i] = Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
