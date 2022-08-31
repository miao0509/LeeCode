package white.meituan;

import java.util.Scanner;

public class two20211 {
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[m+1][n+1];
        for (int i = 0; i < n ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            for (int j = 0; j <= m; j++) {
                if (nums[j][0] == 0 ){
                    nums[j][0] = 1;
                    nums[j][a] = 1;
                    nums[j][b] = 1;
                    break;
                }else if (nums[j][a] ==1||nums[j][b] == 1){
                    nums[j][a] = 1;
                    nums[j][b] = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (nums[i][0] !=0){
                System.out.println(i + 1);
                for (int j = 1; j <= n ; j++) {
                    if (nums[i][j] != 0)
                        System.out.print(j + " ");

                }
                System.out.println();
            }

        }
    }
}
