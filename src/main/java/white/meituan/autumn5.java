package white.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class autumn5 {
    static int ans = 0;

    static List<String> path = new ArrayList<>();
    public static void process(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        back(str,0);

    }
    public static void back(String s , int index){
        if (index >= s.length()){
            int temp = 0;
            for (int i = 0; i < path.size(); i++) {
                int sum = 0;
                for (int j = 0; j < path.get(i).length(); j++) {
                    int val = Integer.parseInt(String.valueOf(path.get(i).charAt(j)));
                    sum = val + sum;
                }
                if (sum % 7 == 0){
                    temp++;
                }
            }
            ans = Math.max(ans,temp);
            return;
        }
        for (int i = index; i < s.length() ; i++) {
            path.add(s.substring(index,i +1));
            back(s,i+1);
            path.remove(path.size() -1);
        }
    }

    public static void main(String[] args) {
        process();
        System.out.println(ans);
    }
}
