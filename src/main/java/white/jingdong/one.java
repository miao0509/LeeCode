package white.jingdong;

import java.util.HashMap;
import java.util.Scanner;
/*
题目描述：
Alice需要用n块相同的大小为1*k的方形地砖铺满一块大小为n*k的地板。她数学不是很好，所以希望你帮她计算有多少种不同的铺法。

如下图，使用5块大小为1*3的方形地砖铺满一块大小为5*3的地板总共有四种铺法。
输入仅包含一行，这行仅包含两个数n(1<=n<=10000)，k(1<=k<=1000)，代表题目中的参数。
输出所求的答案。因为答案可能很大，你只需要输出答案除以998244353所得的余数。


就是一个尝试的模型。我这里让n 表示较大的，k表示较小的。
考虑1-n 每一个位置
边界：n-k+1 此时可以竖着放，可以横着放，放完之后没有别的选择，返回2
大于边界位置  只能竖着  所以1
其他  就是尝试每一个位置  如果竖着放  那可以去 下一个位置
横着放  长度是k  意味着下面的全是横着  所以去i+k
这样写只能82%  超时   于是 dp优化一下
 */
public class one {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int max = Math.max(n, k);
        int min = max==n ? k: n;
//        System.out.println(prcoessdp(max, min));
        System.out.println(process(max, min, 1, new HashMap<>()));
    }
    //n > k
    public static long process(int n, int k, int index, HashMap<Integer, Long> map){
        if(map.containsKey(index)){
            return  map.get(index);
        }
        if(index > n) return  -1;
        long ans = 0;
        if(index == n-k+1){
            // ans =  process(n, k, index+1, map) + 1;
            ans = 2;
        }else if(index > n-k+1){
            ans= 1;
        }else{
            long p1= process(n,k,index+1, map);
            long p2 = process(n,k,index+k, map);
            p1 = p1 % 998244353;
            p2 = p2 % 998244353;
            if(p1 == -1) p1=0;
            if(p2 == -1) p2=0;
            ans = p1+p2;
        }
        ans = ans % 998244353;
        map.put(index, ans);
        return  ans;
    }

    public static long prcoessdp(int n, int k){
        long[] dp = new long[n+1];
        for(int i = n; i > n-k+1;i--)
            dp[i] = 1;
        dp[n-k+1] = 2;
        for(int i = n-k+1-1; i >= 1; i--){
            long p1 = 0, p2 = 0;
            if(i+k <= n){
                p1 = dp[i+k];
            }
            p2 = dp[i+1];
            dp[i] = (p1+p2)% 998244353;
        }

        return  dp[1];
    }
}