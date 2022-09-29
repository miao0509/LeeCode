package white.search;

import java.util.Arrays;

public class insert {
    public static void insert(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j >=0 && arr[j]> temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,48,3,18,38,7,2};
        insert.insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
