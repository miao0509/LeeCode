package white.problems.medium;

public class singleNumber {
    public int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int num : nums) {
            ans = ans^num;
        }
        return ans^nums[0];
    }
}
