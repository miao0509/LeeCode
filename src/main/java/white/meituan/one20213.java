package white.meituan;

import java.util.Scanner;

public class one20213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int val = 0,pay = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a>=b) val +=a;
            else  val +=b;
            pay += b;
        }
        System.out.println(val + " " +(val-pay));
    }
}
