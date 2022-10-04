package white.codeReview.dp;

public class uniquePathsWithObstacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length,n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] != 1){
                dp[i][0] = 1;
            }else {
                break;
            }

        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] != 1) {
                dp[0][i] = 1;
            }else {
                break;
            }

        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
               if (obstacleGrid[i][j] != 1){
                   dp[i][j] = dp[i-1][j] + dp[i][j-1];
               }
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] obs = {{1,0}};
        System.out.println(uniquePathsWithObstacles(obs));
    }
}