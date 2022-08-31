package white.problems.easy;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i]==val) j++;
            else nums[i-j]=nums[i];
        }
        length = length-j;
        return  length;
    }

}
