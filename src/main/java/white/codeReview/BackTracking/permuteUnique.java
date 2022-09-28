package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class permuteUnique {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        process(nums,used);
        return ans;
    }
    public static void process(int[] nums,boolean[] used){
        if (path.size() == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        boolean[] b = new boolean[21];
        for (int i = 0; i < nums.length; i++) {
            if (!used[i] && !b[nums[i]+10] ){
                b[nums[i]+10] = true;
                path.add(nums[i] );
                used[i] = true;
                process(nums,used);
                used[i] = false;
                path.remove(path.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
