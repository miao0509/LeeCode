package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    static List<List<Integer>> ans = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> subsets(int[] nums) {
        process(nums,0);
        return ans;
    }
    public static void process(int[] nums,int index){
        ans.add(new ArrayList<>(path));
        for (int i = index; i < nums.length; i++) {
            path.add(nums[i]);
            process(nums,i+1);
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
