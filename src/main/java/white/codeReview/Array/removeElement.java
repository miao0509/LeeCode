package white.codeReview.Array;

public class removeElement {
    public static int removeElementV2(int[] nums, int val) {
        int ans = 0;
        for (int i = 0,j =0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j++] = nums[i];
            }
            ans = j;
        }

        return  ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2};
        System.out.println(removeElementV2(nums, 3));
    }
}
