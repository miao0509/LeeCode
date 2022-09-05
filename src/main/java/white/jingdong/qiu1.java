package white.jingdong;

import java.util.Arrays;
import java.util.Scanner;

public class qiu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums =new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int count = 0;
        for (int i = n-2,j = n-1; i >=0; i--,j--) {
            count++;
            if (nums[i]!=nums[j]){
                break;
            }
        }
        System.out.println(n==1?0:n-count);
    }
}
