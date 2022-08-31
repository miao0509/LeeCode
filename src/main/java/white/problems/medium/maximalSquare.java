package white.problems.medium;

public class maximalSquare {
    public int maximalSquare(char[][] matrix) {
        int maxSide = 0;
        if (matrix==null||matrix.length==0||matrix[0].length==0){
            return 0;
        }
        int m = matrix.length,n=matrix[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]=='1'){
                    if (i==0||j==0){
                        dp[i][j] = 1;
                    }else {
                        dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]))+1;
                    }
                    maxSide = Math.max(maxSide,dp[i][j]);
                }
            }
        }
        return maxSide * maxSide;

    }


}
