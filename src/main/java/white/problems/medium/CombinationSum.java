package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backTracking(candidates,target,sum,0);
        return ans;
    }
    //为什么设置了index就可以去重？
    public void backTracking(int[] candidates,int target,int sum,int index){
        if (sum > target) return;
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }
//        for (int i = index; i < candidates.length; i++) {
        for (int i = index; i < candidates.length&&sum+candidates[i]<=target; i++) {
            sum +=candidates[i];
            path.add(candidates[i]);
//            while (candidates[i]==candidates[i+1]) i++;
            backTracking(candidates,target,sum,i); //index为i而不是i+1 就表明可以重复读取
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
