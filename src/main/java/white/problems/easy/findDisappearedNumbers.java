package white.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int[] val = new int[nums.length+1];
        val[0] = 1;
        for (int num : nums) {
            val[num]++;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < val.length; i++) {
            if (val[i]==0) ans.add(i);
        }
        return ans;
    }
}
