package white.problems.medium;

public class FindTargetSumWays {
    public static void main(String[] args) {
        FindTargetSumWays test = new FindTargetSumWays();
        int[] nums = {100};
        System.out.println(test.find1(nums,100));
    }
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int left = (sum + target) / 2;
        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) return 0;
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >=nums[i] ; j--) {
                dp[j] +=dp[j-nums[i]];
            }
        }
        return dp[left];
    }
    public int findTargetSumWays1(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) sum += num;
        int left = (sum + target) / 2;
        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) return 0;
        int[] dp = new int[left + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = left; j >=nums[i] ; j--) {
                dp[j] +=dp[j-nums[i]];
            }
        }
        return dp[left];
    }

    public int find1(int[] nums,int target){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int len = nums.length;
        int left = (sum + target) / 2;
        if ((sum + target) % 2 != 0 || Math.abs(target) > sum) return 0;
        int[][] dp = new int[len +1][left + 1];
        for (int i = 0; i <= len; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= len; i++){
            for (int j = 0; j <= left; j++){
                if (j < nums[i - 1]){ //-1是为了人为和数字下标对其
                    dp[i][j] = dp[i - 1][j];
                }else{
                    //不用 i 组成j的方法数+用i组成 j-i的方法数
                    dp[i][j] =dp[i-1][j] + dp[i-1][j-nums[i-1]] ;
                }
            }
        }
        return dp[len][left];

    }
}
