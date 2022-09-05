package white.codeReview.Array;

import java.util.Arrays;

public class sortedSquares {
    public static int[] sortedSquares(int[] nums) {
        int i = 0,j = nums.length-1;
        int[] ans = new int[nums.length];
        int count = nums.length-1;
        while (i <=j ){
            if (nums[i] * nums[i] < nums[j]*nums[j]){
                ans[count] =  nums[j]*nums[j];
                j--;
            }
            else {
                ans[count] =  nums[i]*nums[i];
                i++;
            }
            count--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
