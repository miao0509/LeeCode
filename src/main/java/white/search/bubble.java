package white.search;

import white.Utils.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class bubble {
    public static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    utils.swap(arr,j+1,j);
                    flag = true;
                }
            }
            if(!flag ){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,48,3,18,38,7,2};
        bubble.bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
