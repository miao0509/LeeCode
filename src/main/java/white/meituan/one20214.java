package white.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class one20214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        Object[] arr = new Object[n];
//        int[] temp = new int[n];
        List<Object> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        sc.close();
        temp.add(arr[0]);
        boolean flag = true;//本次是否有消除
        while (flag) {
            flag = false;
            for (int i = 1; i < n; i++) {
                if (arr[i]==temp.get(temp.size()-1)){
                    temp.remove(temp.size()-1);
                    temp.add((int)arr[i]+ 1);
                    flag = true;
                }else {
                    temp.add(arr[i]);
                }
            }
            n = temp.size();
            for (int i = 0; i < temp.size(); i++) {
                arr[i] = temp.get(i);
            }
            temp.clear();
            temp.add(arr[0]);
        }
        System.out.println(arr.length-n);
    }
}
