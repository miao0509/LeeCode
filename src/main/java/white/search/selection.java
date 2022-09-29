package white.search;

import white.Utils.utils;

import java.util.Arrays;

public class selection {
    public static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[i]){
                   min = j;
                }
            }
            utils.swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,48,3,18,38,7,2};
        selection.selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
