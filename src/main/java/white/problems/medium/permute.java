package white.problems.medium;

import java.util.LinkedList;
import java.util.List;

public class permute {
    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        List<List<Integer>> permute = permute(num);
        for (List<Integer> list : permute) {
            for (Integer integer : list) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        process(nums, 0, ans);
        return ans;
    }

    public static void process(int[] num, int i, List<List<Integer>> res) {
        if (i == num.length) {
            List<Integer> ans = new LinkedList<>();
            for (int j = 0; j < num.length; j++) {
                ans.add(num[j]);
            }
            res.add(ans);
        }
        for (int j = i; j < num.length; j++) {
            swap(num, i, j);
            process(num, i + 1, res);
            swap(num, i, j);
        }
    }

    public static void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }


}
