package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class permute {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        boolean[] used= new boolean[nums.length];
        process(nums,used);
        return ans;
    }
    public static void process(int[] nums,boolean[] used){
         if (path.size() == nums.length ){
             ans.add(new ArrayList<>(path));
             return;
         }
        for (int i = 0; i < nums.length ; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            process(nums,used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
