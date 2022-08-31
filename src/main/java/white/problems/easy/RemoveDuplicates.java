package white.problems.easy;

public class RemoveDuplicates {
    public static int removeDuplicates(int [] nums){
        int length = nums.length;
        int j = 0;
        for (int i = 1; i < length; i++) {

            if (nums[i]==nums[i-1]) j++;
            else nums[i-j]=nums[i];
        }
        length = length-j;
        return  length;
    }
}
