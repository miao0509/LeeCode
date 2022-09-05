package white.problems.medium;

public class maxUncrossedLines {
    public static void main(String[] args) {
       int[] nums1 ={5,4,3,2,1};
        int[] nums2 ={1,5,3,4,2};
        System.out.println(maxUncrossedLines(nums1, nums2));
    }
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1])
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i][j - 1],dp[i-1][j]); //key!!!
            }
        }

        return dp[nums1.length][nums2.length];
    }
}
