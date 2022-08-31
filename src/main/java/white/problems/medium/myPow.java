package white.problems.medium;

public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow(2, -2));
    }

    public static double myPow(double x, int n) {
        double ans = 1;
        int count = Math.abs(n);
        while (count != 0) {
            ans = ans * x;
            count--;
        }
        if (n < 0) return 1 / ans;
        return ans;
    }

    public static double myPow1(double x, int n) {
        return n > 0 ? process(x, n) : 1 / process(x, -n);
    }

    public static double process(double x, int n) {
        if (n == 0) return 1;
        double y = process(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}
