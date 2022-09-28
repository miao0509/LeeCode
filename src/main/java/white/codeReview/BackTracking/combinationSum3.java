package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> ans = new ArrayList<>();
    public static List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        process(k,n,0,1);
        return res;

    }
    public static void process(int k, int n, int sum ,int time){
        if (sum > n) {
            return;
        }
        if (sum == n){
            if (ans.size() == k){
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        for (int i = time; i <= 9 ; i++) {
            ans.add(i);
            sum = sum + i;
            process(k,n,sum,i + 1);
            sum = sum - i;
            ans.remove(ans.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 9));
    }
}

