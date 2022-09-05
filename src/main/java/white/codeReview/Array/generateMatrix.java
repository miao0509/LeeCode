package white.codeReview.Array;

import java.util.Arrays;

public class generateMatrix {
    public static int[][] generateMatrix(int n) {
        int start = 0;
        int num = 1;
        int[][] ans = new int[n][n];
        int loop = 0;
        int i , j ;
        while (loop ++ < n / 2 ){
            for ( i = start  ; i < n - loop  ; i++) {
                ans[start][i] = num++;
            }
            for( j = start; j < n - loop;j ++){
                ans[j][i] = num++;
            }
            for( ; i >= loop; i --){
                ans[j][i] = num++;
            }
            for(; j >=loop ; j--){
                ans[j][i] = num++;
            }
            start++;
        }
        if (n % 2 == 1){
            ans[n/2][n/2] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }
}
