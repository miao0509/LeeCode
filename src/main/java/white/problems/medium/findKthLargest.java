package white.problems.medium;

public class findKthLargest {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 8, 4, 0};
        findKthLargest test = new findKthLargest();
        System.out.println(test.findKthLargest(nums, 4));
    }

    public int findKthLargest(int[] nums, int k) {
        int left = 0;
        int right = nums.length-1;
        while (true){
            int i = quick(nums, left, right);
            if (i == k-1) return nums[i];
            else if (i <k-1)
                left = i + 1;
            else
                right = i - 1;
        }
    }
    public int quick(int[] nums, int left, int right) {

        int i = left, j = right, val = nums[i];
        while (i < j) {
            while (i < j && nums[j] < val) {
                j--;
            }
            if (i < j) nums[i++] = nums[j];
            while (i < j && nums[i] > val) {
                i++;
            }
            if (i < j) nums[j--] = nums[i];
        }
        nums[i] = val;
        return i;
    }
}
