package white.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class autumn1 {
    public static void process(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            double n = sc.nextInt();
            double x = sc.nextInt();
            double y = sc.nextInt();
            double k = sc.nextInt();
            if ( k /x == (n-k + 1) / y){
                ans.add("Tie");
            }else if (k /x > (n-k) / y){
                ans.add("Lose");
            }else {
                ans.add("Win");
            }
        }
        for (String an : ans) {
            System.out.println(an);
        }
    }

    public static void main(String[] args) {
        process();
    }
}
