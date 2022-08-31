package white.problems.easy;

public class majorityElement {
    public static void main(String[] args) {
        int[] nums={3,4,3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
