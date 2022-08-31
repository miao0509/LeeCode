package white.problems.medium;

public class countSubstrings {
    public static void main(String[] args) {
        System.out.println(countSubstrings("aaa"));
    }
    public static int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (i == j || j - i == 1) {
                        dp[i][j] = true;
                        result++;
                    } else if (dp[i][j] = dp[i + 1][j - 1])
                        result++;
                }
            }
        }
        return result;
    }
}
