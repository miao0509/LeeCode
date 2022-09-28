package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//同一层去重 visited【】  同一个树枝去重  index
public class combinationSum {
    static List<List<Integer>> res = new ArrayList<>();
    static List<Integer> ans = new ArrayList<>();
    public  static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        boolean[] visited = new boolean[candidates.length];
        Arrays.sort(candidates);
        process(0 ,target,candidates,0,visited);
        return res;
    }
    public static void process(int sum,int target,int[] candidates,int index,boolean[] visited ){
        if (sum > target){
            return;
        }
        if (sum == target){
            res.add(new ArrayList<>(ans));
        }
        for (int i = index; i <candidates.length ; i++) {
            if (i > 0 && candidates[i]==candidates[i-1] &&!visited[i-1]){
                continue;
            }
            visited[i] = true;
            sum += candidates[i];
            ans.add(candidates[i]);
            process(sum,target,candidates,i+1, visited );
            ans.remove(ans.size()-1);
            sum -= candidates[i];
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, 8));
    }
}
