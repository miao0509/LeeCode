package white.Learn.BLearning;
/*
在数组中找到大于等于target的最左侧下标
 */
public class b2FindLeft {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        process(nums,2);
    }
    public static void process(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int leftBorder = -2;
        while (left<=right){
            int mid = left + (right-left)/2;
            if (nums[mid] >= target){
                right = mid - 1;
                leftBorder = right;
            }else {
                left = mid + 1 ;
            }
        }
        System.out.println(leftBorder + 1);
    }
}
