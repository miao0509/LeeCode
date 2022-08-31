package white.Learn.BLearning;
/*
荷兰国旗问题 给一个数组，一个target  把数组划分为三部分   <target   = target  >target

 */
public class b5helanguoqi {
    public static void main(String[] args) {
        int[] nums = {1,7,3,9,3,2,4,0,5};
        process(nums,3);
        for (int num : nums) {
            System.out.print( num + "  ");
        }
    }
    public static void  process(int[] nums ,int target){
        int left = 0 ;
        int right = nums.length-1;
        int  i = 0;
        while (i <right){
            if (nums[i] <target){
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                i++;
                left++;
            }else if (nums[i] > target){
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            }else {
                i++;
            }
        }
    }
}
