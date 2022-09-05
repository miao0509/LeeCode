package white.codeReview.Array;

public class minSubArrayLen {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int len = Integer.MAX_VALUE;
        if (nums[0] >= target) return 1;
        for (int i = 0, j = 0; j < nums.length  ; j++ ) {
            sum +=nums[j];
            while (sum >=target){
                len = Math.min(len,j-i +1 );
                sum -=nums[i++];

            }

        }
        return len == Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args) {
        int[] arr ={5,1,2,4,3};
        System.out.println(minSubArrayLen(15,arr));
    }
}
