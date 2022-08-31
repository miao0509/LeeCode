package white.problems.easy;

public class findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int[] check = new  int[nums.length];
        for (int num : nums) {
            check[num]++;
            if (check[num] >1)
                return num;
        }
        return 0;
    }
}
