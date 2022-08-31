package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class merge {
    public static void main(String[] args) {
        int[][] nums = {{1,5},{2,3}};
        merge(nums);
    }
    public static int[][] merge(int[][] intervals) {

        List<int[]> list = new ArrayList<>();
        list.addAll(Arrays.asList(intervals));
        list.sort(Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < list.size(); i++) {
            int[] pre = list.get(i - 1);
            int[] cur = list.get(i);
            if (pre[1]>=cur[0]){
                pre[1] = Math.max(pre[1],cur[1]);
                list.remove(i);
                i--;
            }
        }
        int[][] ans = new int[list.size()][2];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return  ans;
    }
}
