package white.problems.easy;

import java.util.Arrays;

public class exchange {
    public static void main(String[] args) {
        int[] nums = {2,4,6};
        System.out.println(Arrays.toString(exchange(nums)));
    }
    public static int[] exchange(int[] nums) {
        int temp ;
        for (int i = 0 ,j = nums.length - 1; i < j;) {
            if (nums[i] % 2 == 0){
               temp = nums[i];
               nums[i] = nums[j];
               nums[j] = temp;
               j--;
            }else {
                i++;
            }
        }
        return nums;
    }
}
