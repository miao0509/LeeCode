package white.problems.medium;

public class CanCompleteCircuit {
    public static void main(String[] args) {
        CanCompleteCircuit tst = new CanCompleteCircuit();
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] gas2 = {2, 3, 4};
        int[] gas3 = {5, 1, 2, 3, 4};
        int[] cost1 = {3, 4, 5, 1, 2};
        int[] cost2 = {3, 4, 3};
        int[] cost3 = {4, 4, 1, 5, 1};
        int i = tst.canCompleteCircuit1(gas3, cost3);
        System.out.println(i);

    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] left = new int[gas.length];
        for (int i = 0; i < gas.length; i++) {
            left[i] = gas[i] - cost[i];
        }
        int sum = 0;
        for (int i : left) {
            sum += i;
        }
        if (sum < 0) return -1;

        for (int i = 0; i < gas.length; i++) {
            int can = 0;
            int count = 0;//第几次到这个点
            if (left[i] >= 0) {//从这一点到下一点够用
                for (int j = i; count != 2; j = (j + 1) % gas.length) {
                    can = can + left[j];
                    if (j == i) count++;
                    if (can < 0)  {
                        i= j;
                        break;
                    }
                }
                if (can >= 0) return i;
            }
        }
        return -1;
    }
    //答案 想法和我的一样 但是每次更新点和我不一样
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                index = (i + 1) % gas.length ;
                curSum = 0;
            }
        }
        if (totalSum < 0) return -1;
        return index;
    }
}

