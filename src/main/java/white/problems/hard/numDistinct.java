package white.problems.hard;

public class numDistinct {
    public static void main(String[] args) {
        System.out.println(isSubsequence("bag", "babgbag"));
    }
    public  static int isSubsequence(String s, String t) {
        if (s.length() == 0) return t.length();
        if (t.length() == 0) return 0;
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        int count = 0;
        for (int i = 1; i <=s.length() ; i++) {
            for (int j = 1; j <=t.length() ; j++) {
                if (s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j - 1 ] + 1;
                }else {
                    dp[i][j] = dp[i][j-1];
                }
                if(dp[i][j] == s.length()) count++;
            }
        }
        return count;
    }
}
