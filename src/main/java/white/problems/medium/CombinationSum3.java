package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    private static List<List<Integer>> ans = new ArrayList<>();
    private static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        combinationSum3(2,18);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        backTracking(n,k,1);
        return ans;
    }

    public static void backTracking(int n,int k,int start){
        if (path.size() == k){
            int sum = 0;
            for (Integer integer : path) {
                sum += integer;
            }
            if (sum == n)
            {
                ans.add(new ArrayList<>(path));
                return;
            }else return;

        }
        for (int i = start; i <= 9 - (k - path.size()) + 1 ; i++) {
            path.add(i);
            backTracking(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
}
