package white.problems.hard;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int temp,max=nums[0];
        for (int i = 1; i < k; i++) {
            max=Math.max(nums[i],max);
        }
        for (int i = k,j=1; i < nums.length; i++,j++) {


        }
        return null;
    }
}
