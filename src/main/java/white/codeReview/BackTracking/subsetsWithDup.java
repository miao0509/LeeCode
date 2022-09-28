package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        boolean[] used = new boolean[21];
        Arrays.sort(nums);
        process(nums,0,used);
        return ans;
    }
    public static void process(int[] nums,int index,boolean[] used) {
        ans.add(new ArrayList<>(path));

        for (int i = index; i < nums.length ; i++) {
            if (i > 0 && nums[i-1] == nums[i] &!used[i-1]){
                continue;
            }
            used[i] = true;
            path.add(nums[i] );
            process(nums,i+1,used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,4,4,4,4};
        System.out.println(subsetsWithDup(nums));
    }
}
