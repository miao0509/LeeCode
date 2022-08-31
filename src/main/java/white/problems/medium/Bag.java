package white.problems.medium;

public class Bag {
    public static void main(String[] args) {
        Bag bag = new Bag();
        int[] weights  = {1,3,4};
        int[] values = {15,20,30};
        System.out.println(bag.bag(weights,values,4));
    }
    //二维数组 表示
    public int bag(int[] weights,int[] values,int size){
        int[][] dp = new int[weights.length][size+1];
        for (int i = 0; i < weights.length; i++) {
            dp[i][0] = 0; //容量为0，价值为0；
        }
        for (int i = 0; i <= size; i++) {
            if (i<weights[0]) dp[0][i] = 0;
            else dp[0][i] = values[0];
        }
        for (int i =1; i <weights.length ; i++) {//w物品
            for (int j = 0; j <=size ; j++) {//背包
                if (j<weights[i]) dp[i][j] =dp[i-1][j];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weights[i]]+values[i]);
            }
        }
        return dp[weights.length-1][size];

    }
    //一维数组表示
    public int bag1(int[]weights,int[]values,int size){
        int[] dp = new int[size+1];
        for (int i = 0; i <weights.length ; i++) { //物品
            for (int j = size; j >=weights[i] ; j--) { //容量
                dp[j] = Math.max(dp[j],dp[j-weights[i]]+values[i]);
            }
        }
        return dp[size];
    }
}
