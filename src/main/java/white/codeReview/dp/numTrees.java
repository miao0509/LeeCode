package white.codeReview.dp;

import java.util.HashMap;
import java.util.Map;

public class numTrees {
    public static int numTrees(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                dp[i] = dp[i] + dp[j-1]*dp[i-j];
            }
        }
        return dp[n];
    }
    static Map<Integer,Integer> map = new HashMap<>();
    public static int numTrees1(int n) {
        if (n == 0 || n ==1 ){
            return 1;
        }
        if (map.containsKey(n)){
            return map.get(n);
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int left = numTrees1(i-1);
            int right = numTrees1(n-i);
            count += left*right;
        }
        map.put(n,count);
        return count;
    }


    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
}
