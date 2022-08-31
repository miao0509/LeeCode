package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermuteUnique {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        PermuteUnique test = new PermuteUnique();
        List<List<Integer>> lists = test.permuteUnique(nums);
        System.out.println(lists);
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visit = new boolean[nums.length];
        Arrays.sort(nums);
        backTracking(nums,visit);
        return ans;
    }
    public void backTracking(int[] nums ,boolean[] visit){
        if (path.size()==nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (i>0&&nums[i]==nums[i-1]&&visit[i-1] == false){
                continue;
            }
            if (visit[i] == false){
                visit[i] = true;
                path.add(nums[i]);
                backTracking(nums,visit);
                visit[i] =false;
                path.remove(path.size()-1);
           }

        }

    }

}
