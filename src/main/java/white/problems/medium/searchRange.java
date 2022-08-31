package white.problems.medium;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 */
public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8};
        int[] ints = searchRange(nums, 8);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
    public static int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int start ;
        int end ;
        int mid =-1 ;
        boolean flag = false;
        while (l<=r){
            mid = l+(r-l)/2;
            if (nums[mid]==target){
                flag = true;
                break;
            }
            if (nums[mid]<target) l = mid +1;
            if (nums[mid]>target) r = mid -1;
        }
        if (flag){
            start = mid;
            end = mid;
            while (start>=0&&nums[start]==target) start--;
            while (end<=nums.length-1&&nums[end]==target) end ++;
            return new int[]{start+1,end-1};
        }
        return new int[]{-1,-1};
    }
}
