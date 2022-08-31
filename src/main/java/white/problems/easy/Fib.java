package white.problems.easy;

public class Fib {
    public static void main(String[] args) {
        Fib  fib = new Fib();
        int fib1 = fib.fib(4);
        System.out.println(fib1);
    }
    public int fib(int n){
        int f0 = 0;
        int f1 = 1;
        int cur = 0;
        if (n ==0 )return f0;
        if (n ==1 )return f1;
        for (int i = 1; i < n; i++) {
            cur = f0+ f1;
            f0 = f1;
            f1 = cur;
        }
        return cur;
    }
}
