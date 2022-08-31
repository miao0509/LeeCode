package white.problems.easy;

public class Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int search = search(nums, 2);
        System.out.println(search);
    }
    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int mid = l+(r-l)/2;
            if (nums[mid]==target){
                return mid;
            }
            if (nums[mid]<target) l = mid +1;
            if (nums[mid]>target) r = mid -1;
        }
        return -1;
    }
}
