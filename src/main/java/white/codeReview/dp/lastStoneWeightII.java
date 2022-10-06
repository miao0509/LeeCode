package white.codeReview.dp;

import java.util.Arrays;

public class lastStoneWeightII {
    public static int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum() ;
        int tag = sum / 2;
        int[] dp = new int[tag + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = tag; j >=stones[i] ; j--) {
                dp[j] = Math.max(dp[j],dp[j-stones[i]] + stones[i] );
            }
        }
        return sum - 2 * dp[tag];
    }

    public static void main(String[] args) {
        System.out.println(lastStoneWeightII(new int[]{31,26,33,21,40}));
    }
}
