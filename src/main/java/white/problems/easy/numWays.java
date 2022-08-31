package white.problems.easy;

public class numWays {
    public int numWays(int n) {
        int a = 1;
        int b = 2;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int ans = 0;
        for (int i = 3; i <= n; i++) {
            ans = (a + b) % 1000000007;
            a = b;
            b = ans;
        }
        return ans;
    }
}
