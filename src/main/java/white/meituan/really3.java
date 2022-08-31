package white.meituan;

import java.util.Scanner;

public class really3 {
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n+1];
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int l = arr1[i];
            int r = arr2[i];
            for (int j = l; j <=r ; j++) {
                nums[j]++;
            }
        }
        int count =0;
        for (int num : nums) {
            if (num >=2) count++;
        }
        System.out.println(count);
    }
}
