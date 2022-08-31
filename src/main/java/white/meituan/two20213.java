package white.meituan;

import java.util.Scanner;

public class two20213 {
    public static void main(String[] args) {
        process();
    }
    public static void process() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String start = "";
        String end = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            String p = sc.next();
            if (start.equals("")){
                start = p;
            }
            String q = sc.next();
            if (end.equals("")){
                end = q;
            }
            if (q.equals(start)){
                count++;
                start = "";
                end = "";
            }
        }
        System.out.println(count);
    }
}
