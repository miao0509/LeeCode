package white.problems.easy;

public class ReverseInteger {
    public static int reverse(int x) {
        int a = 0;
        int b = 0;
        while(x!= 0){
            if (a>Integer.MAX_VALUE/10||a<Integer.MIN_VALUE/10){
                return 0;
            }
            b = x%10;
            a = a*10 + b;
            x = x/10;
        }
        return a;
    }
}
