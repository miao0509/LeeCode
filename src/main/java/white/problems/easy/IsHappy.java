package white.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public static void main(String[] args) {
        boolean happy = isHappy(7);
        System.out.println(happy);
    }
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n!=1&&!set.contains(n)){
            set.add(n);
            n = sum(n);
        }
        return n==1;
    }
    public static int sum(int n ){
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;

    }
}
