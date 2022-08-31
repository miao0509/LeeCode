package white.problems.easy;

public class ClimbStairs {
    public static void main(String[] args) {
        int i = climbStairs(5);
        System.out.println(i);
    }
    public static int climbStairs(int n) {
        if (n==1||n==2) return n;
        int pre1 = 2;//前一格有多少方法
        int pre2 = 1; //前两个有多少方法
        int ans = 0;
        while (n-2!=0){
            ans = pre1 +pre2;
            pre2 =pre1;
            pre1 = ans;
            n--;
        }
        return ans;
    }
}
