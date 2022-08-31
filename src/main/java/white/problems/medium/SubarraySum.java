package white.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        SubarraySum test = new SubarraySum();
        int[] nums ={1,-1,0};
        System.out.println(test.subarraySum(nums, 0));
    }
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            pre +=nums[i];
            if (map.containsKey(pre-k)){
                count = map.get(pre - k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }
}
