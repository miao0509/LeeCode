package white.problems.medium;

public class Rob1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums){
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int result1 = robRange(nums,0,nums.length-1);
        int result2 = robRange(nums,1,nums.length);
        return Math.max(result1,result2);
    }
    public static int robRange(int[] nums,int start,int end) {
        if (end == start) return nums[start];
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end-1];
    }

}
