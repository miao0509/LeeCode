package white.problems.medium;

import java.util.Arrays;

public class findUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (isSort(nums)) return 0;
        int[] sort = new int[nums.length];
        System.arraycopy(nums,0,sort,0,nums.length);
        Arrays.sort(sort);
        int left=0,right=0;
        for (int i = 0; i < nums.length; i++) {
            if (sort[i]!=nums[i]){
                left =i;
                break;
            }
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            if (sort[i]!=nums[i]){
                right = i;
                break;
            }
        }
        return right-left+1;
    }

    private boolean isSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<nums[i-1]) return false;
        }
        return true;
    }
    public int findUnsortedSubarray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int left=-1,right=-1;
        for (int i = 0; i < nums.length; i++) {
            if (max>nums[i]){
                left = i;
            }else {
                max = nums[i];
            }
            if (min<nums[nums.length-i-1]){
                right = i;
            }else {
                min = nums[nums.length-i-1];
            }
        }
        return right==-1?0:right-left+1;

    }
}
