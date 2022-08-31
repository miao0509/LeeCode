package white.Learn.practices;

import java.util.Arrays;

public class BagProblem {
    public static void main(String[] args) {
        process6();
    }
    //01 背包  二维 先遍历物品 再遍历容量
    public static void process1() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[][] dp = new int[value.length][bagWeight + 1];
        for (int i = 0; i <= bagWeight; i++) {
            dp[0][i] = value[0];
        }
        for (int i = 0; i < weight.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i < value.length; i++) {
            for (int j = 1; j <= bagWeight; j++) {
                if (j - weight[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[value.length - 1][bagWeight]);
    }
    // 01背包 二维 先遍历容量  再遍历物品
    public static void process2() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[][] dp = new int[value.length][bagWeight + 1];
        for (int i = 0; i <= bagWeight; i++) {
            dp[0][i] = value[0];
        }
        for (int i = 0; i < weight.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j <= bagWeight; j++) {
            for (int i = 1; i < value.length; i++) {
                if (j - weight[i] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[value.length - 1][bagWeight]);
    }
    //完全背包，因为可以重复放物品 一维 先遍历物品 再遍历即容量  容量从小到大
    public static void process3() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = 1; j <= bagWeight; j++) {
                if (j - weight[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
    // 01背包  只能先遍历物品 再遍历背包 容量从大到小
    public static void process4() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < weight.length; i++) {
            for (int j = bagWeight; j >=1 ; j--) {
                if (j - weight[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
    //先遍历容量 再遍历物品 容量从小到大 == 完全背包 一维
    public static void process5() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];
        for (int i = 1; i <= bagWeight; i++) {//i 是容量 j是物品
            for (int j =0 ; j <weight.length ; j++) {
                if (i - weight[j] >= 0) {
                    dp[i] = Math.max(dp[i], dp[i - weight[j]] + value[j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
    //啥背包都不是   先遍历容量 再遍历物品 容量从大到小 就会只放入一种物品
    public static void process6() {
        int[] value = {15, 20, 30};
        int[] weight = {1, 3, 4};
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];
        for (int i = bagWeight; i >=1 ; i--) {//i 是容量 j是物品
            for (int j =0 ; j <weight.length ; j++) {
                if (i - weight[j] >= 0) {
                    dp[i] = Math.max(dp[i], dp[i - weight[j]] + value[j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}
