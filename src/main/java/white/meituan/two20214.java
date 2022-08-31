package white.meituan;

import java.util.*;

public class two20214 {
    public static void main(String[] args) {
        process();
    }
    public static void process() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        int[][] nums = new int[2][n];
        int[] flag = new int[n];
        int countA = 0;
        int countB = 0;
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int valueA = sc.nextInt();
            int valueB = sc.nextInt();
            nums[0][i] = valueA;
            nums[1][i] = valueB;
            if ((valueA - valueB) >= 0) {
                listA.add(valueA);
                flag[i] = 1;
                countA++;
            } else {
                listB.add(valueB);
                countB++;
            }
        }

        if (countA >=a){
            Collections.sort(listA);
            for (int i = 0; i < a; i++) {
                result +=listA.remove(listA.size()-1);
            }
            listB.addAll(listA);
            Collections.sort(listB);
            for (int i = 0; i < b; i++) {
                result +=listB.remove(listB.size()-1);
            }
        }else {
            Collections.sort(listB);
            for (int i = 0; i < b; i++) {
                result +=listB.remove(listB.size()-1);
            }
            listA.addAll(listB);
            Collections.sort(listA);
            for (int i = 0; i < a; i++) {
                result +=listA.remove(listA.size()-1);
            }
        }
        System.out.println(result);

    }
}
