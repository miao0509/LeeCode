package white.Learn.BLearning;

public class b7HeapSort {
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    //向上调整
    public static void heapInsert(int[] nums, int index) {
        while (nums[index] > nums[(index - 1) / 2]) {
            swap(nums, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    //向下调整
    public static void heapify(int[] nums, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            int largest = left + 1 < heapSize && nums[left + 1] > nums[left] ? left + 1 : left;
            largest = nums[largest] > nums[index] ? largest : index;
            if (largest == index) break;
            swap(nums,largest,index);
            index = largest;
            left = index * 2 + 1;
        }
    }
    ///heapSize 代表有多少个数 而不是下标
    public static void heapSort(int[] nums) {
        if (nums == null || nums.length < 2) return;
        /*for (int i = 0; i < nums.length; i++) {
            heapInsert(nums, i);
        }*/
        for (int i = (nums.length-1) / 2 ; i >= 0; i--) {
            heapify(nums,i,nums.length);
        }
        //要把最后一个数排除在外了  所以 -1
        int heapSize = nums.length - 1;
        swap(nums, 0, heapSize);
        while (heapSize > 0) {
            heapify(nums, 0, heapSize);
            swap(nums, 0, --heapSize);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 3, 9, 7};
        heapSort(nums);
        for (int num : nums) {
            System.out.print(num + "  ");
        }
    }
}
