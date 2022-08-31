package white.jingdong;

import java.util.Scanner;
/*
       Alice和Bob需要采购会议场馆内的无线路由器。每一种路由器有一个参数k用于度量其通信距离。将场馆视为一个二维平面并将路由器视为该平面上的点，两台参数为k的路由器只能在他们所在位置的曼哈顿距离不超过k的前提下直接通信。两个点(x1,y1)和(x2,y2)之间的曼哈顿距离被定义为|x1-x2|+|y1-y2|。
 
       给出场馆内需要安装无线路由器的所有位置的坐标，请你计算出若他们只采购一种路由器，则其参数k至少需要为多少才能使得任意两个路由器之间都能够互相通信。
 
       能够互相通信的定义如下：存在一个路由器序列v1,v2,…,vc，该序列中任意两个相邻路由器之间可以直接连接，则v1和vc之间可以互相通信。
 */
/*
第一行有一个正整数n(1<=n<=1000)，代表需要安装路由器的位置数量。
 
第二行有n个整数，第i个代表编号为i的位置的x坐标。
 
第三行有n个整数，第i个代表编号为i的位置的y坐标。
 
坐标的绝对值不超过1000000000。
输出一个正整数，代表能够使得任意两个路由器在允许中继的前提下能够互相通信的参数的最小值。
 */
public class two {
    static long[] x;
    static long[] y;
    static  int n;
    public static void main(String[] args) {
        //System.out.println(Long.MAX_VALUE);
        Scanner in= new Scanner(System.in);
        n = in.nextInt();
        x = new long[n];
        y = new long[n];
        long xmax=Long.MIN_VALUE, xmin=Long.MAX_VALUE, ymax=Long.MIN_VALUE, ymin=Long.MAX_VALUE;
        for(int i=0; i < n;i++){
            x[i] = in.nextLong();
            xmax = Math.max(xmax, x[i]);
            xmin = Math.min(xmin, x[i]);
        }

        for(int i=0; i < n;i++){
            y[i] = in.nextLong();
            ymax = Math.max(ymax, y[i]);
            ymin = Math.min(ymin, y[i]);
        }

        Long max = Long.MIN_VALUE;
        Long min = Long.MAX_VALUE;
        long[][] graph = new long[n][n];
        for(int i = 0; i < n; i++)
            for(int j = 0; j <n; j++)
                graph[i][j] = Long.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                long dis = distance(i, j);
                graph[i][j] = dis;
                graph[j][i] = dis;
                max = Math.max(max, dis);
                min = Math.min(min, dis);
            }
        }


        //左下角的点  右上角的点
        long ans = prim(graph);
        if(ans == -1)
            System.out.println(max);
        else
            System.out.println(ans);

    }
    public static long distance(int i, int j){
        long x1 = Math.abs(x[i]-x[j]);
        long y1 = Math.abs(y[i] - y[j]);
        return x1 + y1;
    }
    public static long prim(long[][] graph){
        long[] dis = new long[n];
        boolean[] isVisit = new boolean[n];
        isVisit[0] = true;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n; i++){
            dis[i] = graph[0][i];
        }
        for(int i = 1; i < n; i++){
            long minPath = Long.MAX_VALUE;
            int index = -1;
            for(int j = 0; j < n; j++){
                if(!isVisit[j] && dis[j] < minPath){
                    minPath = dis[j];
                    index = j;
                }
            }
            if(index == -1){
                return -1;
            }
            isVisit[index] =true;
            ans = Math.max(ans, minPath);
            for(int j = 0; j < n; j++){
                if(!isVisit[j] && dis[j] > graph[index][j]){
                    dis[j] = graph[index][j];
                }
            }
        }
        return  ans;
    }
}