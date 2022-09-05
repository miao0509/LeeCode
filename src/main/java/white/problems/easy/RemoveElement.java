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
    public static int removeElementV2(int[] nums, int val) {
        int ans = 0;
        for (int i = 0,j =0; i < nums.length; i++) {
            if (nums[i] != nums[j]){
                nums[j++] = nums[i];
            }
            ans = j;
        }

        return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2};
        System.out.println(removeElement(nums, 3));
    }

}
