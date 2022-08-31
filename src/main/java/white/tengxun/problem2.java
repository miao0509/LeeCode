package white.tengxun;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(7);
        a.add(2);
        a.add(1);
        System.out.println(minMax(a, 3, 2));
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((b,c)->(c - b));
        
    }
    public static int minMax (ArrayList<Integer> a, int k, int x) {
        int[] nums = new int[a.size()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a.get(i);
        }
        handle(nums,k,x);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max  = Math.max(max,nums[i]);
        }
        return max;
    }
    ///heapSize 代表有多少个数 而不是下标
    public static void handle(int[] nums,int k ,int x) {
        if (nums == null || nums.length < 2) return;
        for (int i = (nums.length-1) / 2 ; i >= 0; i--) {
            heapify(nums,i,nums.length);
        }
        //要把最后一个数排除在外了  所以 -1
        int heapSize = nums.length ;
        while (k > 0) {
            heapify(nums, 0, heapSize);
            nums[0] = nums[0]-x;
            swap(nums, 0, heapSize -1);
            k--;
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
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
