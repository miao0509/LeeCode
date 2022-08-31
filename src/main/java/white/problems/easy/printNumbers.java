package white.problems.easy;

import java.util.Arrays;

public class printNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printNumbers(2)));

    }
    public static int[] printNumbers(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            count *=10;
        }
        int[] ans = new int[count-1];
        for (int i = 1; i < count; i++) {
            ans[i-1] = i;
        }
        return ans;
    }
}
