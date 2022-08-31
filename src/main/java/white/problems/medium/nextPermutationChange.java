package white.problems.medium;

/**
 * 不同于leecode31题要求1 <= nums.length <= 100
 *                         0 <= nums[i] <= 100
 *  本方法nums.length不能太长，否则int就溢出了
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 */
public class nextPermutationChange {
    // max 当before已经是最大时，选差值中最小的， 就是最小值
    //  min 当before还不是最大时，选插值中最小的，就是下一个排列
    public static int max=Integer.MAX_VALUE;
    public static int min=Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[] a = { 1,1,5};
        int x = 0;
        for (int j = 0; j < a.length; j++) {
            x = x * 10+ a[j] ;
        }
        process(a,0,x);
        if (max!=Integer.MAX_VALUE) x = x+max;
        if (min!=Integer.MAX_VALUE) x = x+min;
        System.out.println(x);
     }

    /**
     * 因为不知道数组长度，所以不知道循环几次，因此需要递归
     *
     * @param nums   当前数组
     * @param i      循环到数组第几个
     * @param before 最开始的排列数字
     */
    public static void process(int[] nums, int i, int before) {
        if (i == nums.length) {
            int x = 0;//当前排序的值
            int len = 0;//当前排序与最开始的差值
            for (int j = 0; j < nums.length; j++) {
                x = x * 10+ nums[j] ;
            }
            len = x - before;
            if (len > 0 && len < min) {
                min = len;
                return;
            }
            if (len < 0 && len < max) {
                max = len;
                return;
            }
        }
        for (int j = i; j < nums.length; j++) {
            swap(nums, i, j);
            process(nums, i + 1, before);
            swap(nums, i, j);
        }
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
