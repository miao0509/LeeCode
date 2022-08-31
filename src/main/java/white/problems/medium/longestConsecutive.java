package white.problems.medium;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] nus = {23,4,3,9,1,2,32,3,4,4};
        System.out.println(longestConsecutive(nus));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (int num : set) {
            if (!set.contains(num-1)){
                int curlen = 1;
                while (set.contains(num+1)){
                    num++;
                    curlen++;
                }
                max = Math.max(max,curlen);
            }

        }
        return max;
    }
    public int longestConsecutive1(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

}
