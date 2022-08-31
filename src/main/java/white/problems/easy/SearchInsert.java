package white.problems.easy;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int mid=0;
        while(start<end){
            mid = (start+end)/2;
            if (nums[mid]>=target){
                end = mid ;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
}
