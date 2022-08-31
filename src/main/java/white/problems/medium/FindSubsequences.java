package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class FindSubsequences {
    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        FindSubsequences test = new FindSubsequences();
        List<List<Integer>> lists = test.findSubsequences(nums);
        System.out.println(lists);

    }

    List<Integer> path = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();


    public List<List<Integer>> findSubsequences(int[] nums) {

        backTracking(nums, 0);
        return ans;
    }

    public void backTracking(int[] nums, int index) {
        if (path.size() >= 2) {
            ans.add(new ArrayList<Integer>(path));
        }
        boolean[] flag = new boolean[201];
        for (int i = index; i < nums.length; i++) {

            if (flag[nums[i]+100] == true || (!path.isEmpty() && nums[i] < path.get(path.size() - 1))) continue;
            path.add(nums[i]);
            flag[nums[i]+100] = true;
            backTracking(nums, i + 1);
//                    flag[nums[i]] = false;
            path.remove(path.size() - 1);

        }

       //leecode题解
        /*if (cur == nums.length) {
                if (path.size() >= 2) {
                    ans.add(new ArrayList<Integer>(path));
                }
                return;
            }
            if (nums[cur] >= last) {
                path.add(nums[cur]);
                backTracking( nums,cur + 1, nums[cur]);
                path.remove(path.size() - 1);
            }
            if (nums[cur] != last) {
                backTracking( nums,cur + 1, last);
            }*/
    }


}
