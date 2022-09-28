package white.meituan;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class autumn3 {
    static int ans = 0;
    public static void process(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        int[] value = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        for (int  i = 1; i <= n; i++) {
            value[i] = sc.nextInt();
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i <=n ; i++) {
            map.put(p[i],i) ;
        }
        int ans = 0;
        int[] dp = new int[n+1];
        dp[1] = value[1];
        for (int i = 2; i <=n ; i++) {
            int cur = p[i];
            int las = cur % 2 == 0 ? cur / 2 :(cur -1) /2;

        }
       /* int temp = 1;
        while (temp <= p[n-1]){
            temp = temp * 2;
        }
        temp--;
        int i  = 1 ;
        while (i <= temp){

        }*/

    }
    /*public static int dfs (int max,int i ,int val,int[] p ,int[] value){
        if (i >= max){
            return
        }
    }*/



    public static void main(String[] args) {

    }
}
