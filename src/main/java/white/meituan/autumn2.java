package white.meituan;

import java.util.Scanner;

public class autumn2 {
    public static void process(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0,s = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0){
                x++;
                ans++;
            }
            s =s +x;
        }
        if (s!=0){
            System.out.println(ans);
        }else {
            System.out.println(ans+1);
        }
    }

    public static void main(String[] args) {
        process();
    }
}
