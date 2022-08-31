package white.problems.medium;
//1 一次就能跳完 true
//2 跳到能跳的步数之内，比当前大的数上
public class CanJump {
    public static void main(String[] args) {
        CanJump canJump = new CanJump();
        int[] a = {2,3,1,1,4};
        boolean b = canJump.canJump(a);
        System.out.println(b);
    }
    public boolean canJump(int[] nums) {
        if (nums.length==1) return true;
        int cover = 0;
        for (int i = 0; i <=cover; i++) {
            cover = Math.max(cover,nums[i]+i);
            if (cover>=nums.length-1) return true;
        }
        return false;
    }
}
