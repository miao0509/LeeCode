package white.problems.medium;

public class minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int i = minSubArrayLen(7, nums);
        System.out.println(i);
    }

    public static int minSubArrayLen2(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min(result, right - left + 1);
                sum -= nums[left++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        }
        if (sum < target) return 0;
        int length = 1;
        int min = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return 1;
            sum = nums[i];
            length = 1;
            for (int j = i + 1; j < nums.length; j++) {
                sum = sum + nums[j];
                length++;
                if (sum >= target) {
                    if (length < min) {
                        min = length;
                    }
                    break;
                }
            }
        }
        return min;
    }
}
