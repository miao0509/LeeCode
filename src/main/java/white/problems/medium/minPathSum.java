package white.problems.medium;

public class minPathSum {
    public static void main(String[] args) {
        int[][] nums = {{1,2,3},{4,5,6}};
        System.out.println(minPathSum(nums));
    }
    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+grid[i][0];
            dp[i][0] = sum;
        }
        sum = 0;
        for (int i = 0; i < m; i++) {
            sum = sum+grid[0][i];
            dp[0][i] = sum;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.min( dp[i-1][j],dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }
}
