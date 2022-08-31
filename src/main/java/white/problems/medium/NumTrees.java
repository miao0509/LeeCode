package white.problems.medium;

public class NumTrees {
    public static void main(String[] args) {
        NumTrees numTrees = new NumTrees();
        System.out.println(numTrees.numTrees(5));
    }
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                dp[i] = dp[i] + dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
}
