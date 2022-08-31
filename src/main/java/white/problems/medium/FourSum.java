package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums==null||nums.length<4) return ans;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i < nums.length-3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i+1;j<nums.length-2;j++) {

                if (j > i + 1 &&nums[j]==nums[j-1]) continue;
                left = j+1;
                right = nums.length-1;
                while (left<right){
                    if (nums[i]+nums[j]+nums[left]+nums[right]==target) {
                        List<Integer> abc = new ArrayList<>();
                        abc.add(nums[i]);
                        abc.add(nums[j]);
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
                    }else if (nums[i]+nums[j]+nums[left]+nums[right]<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
       /* for (int i = 0; i < ans.size()-1; i++) {
            if (ans.get(i).equals(ans.get(i+1))){
                ans.remove(i+1);
            }
        }*/
        return ans;
    }
}
