package white.problems.medium;

public class WiggleMaxLength {
    public static void main(String[] args) {
        WiggleMaxLength test = new WiggleMaxLength();
        int[] a= {1,1,1,1,1,1};
        int i = test.wiggleMaxLength(a);
        System.out.println(i);
    }
    public int wiggleMaxLength(int[] nums) {
        int result = 1;
        if (nums.length==1||nums.length==2&&nums[0]==nums[1]) return result;
        if (nums.length==2) return ++result;
        boolean flag = true;//元素是否都一样
        for (int i = 1; i <nums.length; i++) {
            if (nums[i-1]!=nums[i]){
                flag=!flag;
                break;
            }
        }
        if (flag) return 1;
        result++;
        int preDiff =0;
        int curDiff = 0;
        //长度至少为3
        for (int i = 1; i < nums.length-1; i++) {
            preDiff = nums[i]-nums[i-1];
            curDiff = nums[i+1]-nums[i];
            if (preDiff<0&&curDiff>0||preDiff>0&&curDiff<0){
                result++;
            }
        }
        return result;
    }
}
