package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        SubsetsWithDup test = new SubsetsWithDup();
        List<List<Integer>> lists = test.subsetsWithDup(nums);
        System.out.println(lists);

    }
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans= new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backTracking(nums,0);
        return ans;
    }
    public void backTracking(int[] nums,int start){
        ans.add(new ArrayList<>(path));
        if (start>=nums.length) return;
        for (int i = start; i < nums.length; i++) {
            if (i>start&&nums[i-1] == nums[i]) continue;
            path.add(nums[i]);
            backTracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
