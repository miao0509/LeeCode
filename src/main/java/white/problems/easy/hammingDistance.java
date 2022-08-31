package white.problems.easy;

public class hammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
    public static int hammingDistance(int x, int y) {
        int ans = x ^ y;
        int count = 0;
        while (ans >0) {
            count += ans &1;
            ans>>=1;
        }
        return count;
    }
}
