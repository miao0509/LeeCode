package white.problems.medium;

import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) { //背包
            for (int j = 0; j < i; j++) { //物品
                String sub = s.substring(j, i);
                if (wordDict.contains(sub) && dp[j] == 1) {
                    dp[i] = 1;
                }
            }
        }
        return dp[s.length()] == 1;
    }
}
