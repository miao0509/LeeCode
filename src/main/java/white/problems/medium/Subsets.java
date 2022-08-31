package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backTracking(nums,0);
        return ans;
    }
    public void backTracking(int[] nums,int start){
        ans.add(new ArrayList<>(path));
        if (start>=nums.length){
            return;
        }
        for (int i = start; i <nums.length ; i++) {
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
