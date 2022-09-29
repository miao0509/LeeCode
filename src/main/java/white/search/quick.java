package white.search;

import white.Utils.utils;

import java.util.Arrays;

public class quick {
    public static void quick(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        quick(arr, l, p - 1);
        quick(arr, p + 1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int p = arr[l];
        int i = l;
        int j = r;
        while (i < j) {
            while (i < j && arr[j] > p) j--;
            while (i < j && arr[i] <= p) i++;
            utils.swap(arr, i, j);
        }
        utils.swap(arr, l, j);
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 48, 3, 18, 38, 7, 2};
        quick.quick(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
