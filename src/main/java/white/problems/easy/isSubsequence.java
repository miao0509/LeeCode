package white.problems.easy;

public class isSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
    public  static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 1; j <=t.length() ; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j - 1 ] + 1;
                }else {
                    dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[s.length()][t.length()] == s.length();
    }
}
