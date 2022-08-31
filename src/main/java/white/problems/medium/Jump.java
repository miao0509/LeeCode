package white.problems.medium;

public class Jump {
    public static void main(String[] args) {
        Jump jump = new Jump();
        int[] nums = {0};
        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {5,4,0,3,2,1,2,1};
        int[] nums3 = {1,2,1,1,1};
        int ans = jump.jump(nums2);
        System.out.println(ans);
    }
    //在最大步数之内选下一个最大的值跳
    public int jump(int[] nums) {
        if (nums.length==1) return 0;
        int res=0;
        int max=nums[0];
        int index = 0 ;//最大值的下标
        int step = nums[0];
        int cur = 0;//本轮i开始的位置
        int curmax = nums[0];
        while(curmax+index<nums.length-1){
            for (int i = index+1; i <=step+cur&&i<nums.length-1; i++) {
                if (nums[i]+i>max+index){
                    curmax = nums[i];
                    index = i;
                }
            }
            cur= index;
            step = curmax;
            max=nums[index+1];
            res++;
        }
        return ++res;
    }
}
