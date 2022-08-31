package white.Learn.BLearning;

/*
相邻的数都不相等 找局部最小值
 */
public class b3FindLocalMin {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1, 5, 4, 3, 2, 3, 4};
        process(nums);
    }
    public static int getLessIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; // no exist
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return 0;
        }
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        int left = 1;
        int right = arr.length - 2;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1]) {
                right = mid - 1;
            } else if (arr[mid] > arr[mid + 1]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }
    public static void process(int[] nums) {
        if (nums == null || nums.length == 0) return;
        if (nums.length == 1) System.out.println(nums[0]);
        if (nums[0] < nums[1]) System.out.println(nums[0]);
        if (nums[nums.length - 1] < nums[nums.length - 2]) System.out.println(nums[nums.length - 1]);
        int left = 1, right = nums.length - 2;
        int mid = 0;
        while (left < right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid - 1]) {
                right = mid - 1;
            } else if (nums[mid] > nums[mid + 1]) {
                left = mid + 1;
            } else {
                System.out.println(nums[mid]);
            }
        }
        System.out.println(nums[left] + "   " + left);
    }
}
