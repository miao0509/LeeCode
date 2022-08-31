package white.meituan;

import java.util.Scanner;

/*
https://www.nowcoder.com/test/question/a9980f73060545ca923344098750af18?pid=28665243&tid=54873148
 */
public class one20211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodes = new int[n + 1];
        int sum = 0;
        int max = 0;
        int dis = 0;
        for (int i = 1; i < n; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            int val = sc.nextInt();
            nodes[to] = nodes[from] + val;
            sum += nodes[to];//所有路径的综合
            dis +=val; //所有边的综合
            max = Math.max(max, nodes[to]);
        }
        System.out.println(sum + " " +(2*dis-max));
    }

}
