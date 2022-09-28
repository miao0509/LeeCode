package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class findSubsequences {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> findSubsequences(int[] nums) {
        process(nums, 0);
        return ans;
    }

    public static void process(int[] nums, int index) {
        if (path.size() >= 2) {
            ans.add(new ArrayList<>(path));
        }
        boolean[] used = new boolean[201];
        for (int i = index; i < nums.length; i++) {
            if ((!path.isEmpty() && path.get(path.size()-1)>nums[i])||used[nums[i]+100]){
                continue;
            }
            path.add(nums[i] );
            used[nums[i]+100] = true;
            process(nums,i+1);
            path.remove(path.size()-1);

        }
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        System.out.println(findSubsequences(nums));
    }
}
