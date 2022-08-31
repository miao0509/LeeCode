package white.meituan;

import java.util.Scanner;

public class really4 {
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        int count = 0;
        int cha1,cha2 ;
        while (max != min){
            if (max - min == 1) {
                min++;
                if (max ==min){
                    count++;
                    break;
                }
            }
            cha1 = Math.abs(min * 2 - max);
            cha2 = Math.abs(max / 2 - min);
            if (cha1 > cha2)
                max = max / 2;
            else
                min = min * 2;
            n = max;
            m = min;
            max = Math.max(n,m);
            min = Math.min(n,m);
            count++;
        }
        System.out.println(count);
    }
}
