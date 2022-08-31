package white.problems.easy;

public class GetLeastNumbers {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 9, 7};
        int[] ints = GetLeastNumbers(nums, 4);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

    public static int[] GetLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        if (arr == null||arr.length == 0 || k == 0) return ans;
        for (int i = arr.length - 1; i >= 0; i--) {
            heapfiy(arr, i, arr.length);
        }
        int heapSize = arr.length;
        for (int i = 0; i < k; i++) {
            ans[i] = arr[0];
            int temp = arr[0];
            arr[0] = arr[heapSize - 1];
            arr[heapSize - 1] = temp;
            heapfiy(arr, 0, --heapSize);
        }
        return ans;
    }

    public static void heapfiy(int[] nums, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int small = left + 1 < heapSize && nums[left + 1] < nums[left] ? left + 1 : left;
            small = nums[small] < nums[index] ? small : index;
            if (small == index) return;
            int temp = nums[index];
            nums[index] = nums[small];
            nums[small] = temp;
            index = small;
            left = index * 2 + 1;
        }
    }
}
