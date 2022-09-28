package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class combine {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> ans = new ArrayList<>();
    public  static List<List<Integer>> combine(int n, int k) {
        process(n,k,1);
        return res;
    }

    public static void process(int n , int k , int time){
        if (ans.size() == k ){
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i = time; i <= n-(k - ans.size()) + 1 ; i++) {
            ans.add(i);
            process(n,k,i+1);
            ans.remove(ans.size() -1);
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(2, 1));
    }
}
