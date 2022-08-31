package white.Learn.BLearning;

/*
求小和   在数组中比num【i】左边比他小的数的和  所有和再求和
解 相当于找右边比他都大的数字
归并排序方法   分成两个数组 看右边的数是否比左边当前数字大   大就累加
如果是求逆序对的话， 把sum换成count就行
左神  p2  1：11
 */
public class b4MinSum {
    static int sum = 0;

    public static void main(String[] args) {
        int[] nums = {1,1,3,4,2,5,10};
        process(nums,0,nums.length - 1);
        System.out.println(sum);
    }
    public static void process(int[] nums, int left, int right) {
        if (left == right) return;
        int mid = left + (right - left) / 2;
        process(nums, left, mid);
        process(nums, mid + 1, right);
        getSum(nums, left, mid, right);
    }

    private static void getSum(int[] nums, int left, int mid, int right) {
        int[] extra = new int[right - left + 1];
        int i , j , k ;
        for ( i = left, j = mid + 1, k = 0; i <= mid && j <= right; ) {
            if (nums[i] < nums[j]) {
                sum += (right - j + 1) * nums[i];
                extra[k++] = nums[i++];
            } else {
                extra[k++] = nums[j++];
            }
        }
        while (i <= mid) extra[k++] = nums[i++];
        while (j <=right) extra[k++] = nums[j++];
        for ( i = left, j = 0; i <= right; i++) {
            nums[i] = extra[j++];
        }

    }
}
