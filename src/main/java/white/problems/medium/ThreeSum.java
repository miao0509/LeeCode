package white.problems.medium;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums==null||nums.length<3) return ans;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) return ans;
            if (i>0&&nums[i]==nums[i-1]) continue;
            left = i+1;
            right = nums.length-1;
            while (left<right){
                if (nums[i]+nums[left]+nums[right]==0) {
                    List<Integer> abc = new ArrayList<>();
                    abc.add(nums[i]);
                    abc.add(nums[left]);
                    abc.add(nums[right]);
                    ans.add(abc);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right -1]) {
                        right--;
                    }
                    left++;
                    right--;
                }else if (nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return ans;
    }
}
