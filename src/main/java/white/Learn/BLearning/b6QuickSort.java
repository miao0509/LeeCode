package white.Learn.BLearning;

public class b6QuickSort {
    public static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = left, j = right, x = nums[left];
            while (i < j) {
                while (i < j && nums[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    nums[i++] = nums[j];
                while (i < j && nums[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    nums[j--] = nums[i];
            }
            nums[i] = x;
            quickSort(nums, left, i - 1); // 递归调用
            quickSort(nums, i + 1, right);
        }
    }

    public static int partition(int[] nums, int left, int right) {
        int value = nums[left];
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] > value) j--;
            if (i < j) nums[i++] = nums[j];
            while (i < j && nums[i] <= value) i++;
            if (i < j) nums[j--] = nums[i];
        }
        nums[i] = value;
        return i;
    }
    public static  int partition1(int[] nums, int lo, int hi) {
        int v = nums[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < v);
            while (--j >= lo && nums[j] > v);
            if (i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[lo] = nums[j];
        nums[j] = v;
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int partition = partition1(arr, 0, arr.length - 1);
        System.out.println(partition);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
