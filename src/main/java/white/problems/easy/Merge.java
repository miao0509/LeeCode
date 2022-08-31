package white.problems.easy;

public class Merge {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0, j = 0,k=0; i < m && j < n; ){
            if (nums1[i] <=nums2[j]){
                ans[k++] = nums1[i++];
            }else {
                ans[k++] = nums2[j++];
            }
        }
        if (i==m){
            while (j<n){
                ans[k++] = nums2[j++];
            }
        }else {
            while (i<m){
                ans[k++] = nums1[i++];
            }
        }
        nums1 = ans;
        for (int l = 0; l < m + n; l++) {
            nums1[l]=ans[l];
        }
        return nums1;
    }
}
