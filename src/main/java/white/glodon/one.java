package white.glodon;

import java.util.Scanner;

public class one {
        public static void main(String[] args) {
            System.out.println(process());
        }

    public static int process(){
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n ; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < n ; i++) {
            end[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (start[i] == end[j]){
                    if (j - ans != i ){
                        ans++;
                    }else {
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
