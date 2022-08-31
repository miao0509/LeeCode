package white.problems.easy;

public class MaxSubArray {
    /**
     * 暴力
     * @param nums
     * @return
     */
    public  int maxSubArray(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum = sum + nums[j];
                if (sum > max) max = sum;
            }

        }
        return max;
    }
    public  int maxSubArray2(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
    public  int maxSubArray3(int[] nums) {
        int cur = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cur += nums[i];
            max = Math.max(cur,max);
            if (cur<=0) cur=0;

        }
        return max;
    }
}
