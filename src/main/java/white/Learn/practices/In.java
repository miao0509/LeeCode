package white.Learn.practices;

import java.util.Arrays;
import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(String.valueOf(-1))){
            int n = scanner.nextInt();
            int[] arr  = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
