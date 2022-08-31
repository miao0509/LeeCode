package white.problems.medium;

public class FindLengthOfLCIS {
    public static void main(String[] args) {
        int[] nums = {1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        int max = 1;
        if (nums.length==1) return max;
        int cur = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i-1]){
                cur++;
                max = Math.max(max,cur);
            }else {
                cur = 1;
            }
        }
        return max;
    }
}
