package white.meituan;

import java.util.Scanner;

public class really2 {
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Scanner sc = new Scanner((System.in));
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int ans = 0;
        ans = (h2-h1)*60 + (m2-m1);
        System.out.println(ans);

    }
}
