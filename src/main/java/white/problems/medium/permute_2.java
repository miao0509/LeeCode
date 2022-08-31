package white.problems.medium;

import java.util.LinkedList;
import java.util.List;

public class permute_2 {
    public static void main(String[] args) {
        int[] num = {1,1,3,2};
        permute_2 permute_2 = new permute_2();
        List<List<Integer>> permute = permute_2.permuteUnique(num);
        for (List<Integer> list : permute) {
            for (Integer integer : list) {
                System.out.print(integer+"  ");
            }
            System.out.println();
        }
    }
    public  List<List<Integer>> permuteUnique(int[] nums) {
        if (nums==null||nums.length==0) return  new LinkedList<>();
        List<List<Integer>> ans = new LinkedList<>();
        process(nums,0,ans);
        return ans;
    }

    public  void process(int[] num, int i, List<List<Integer>> res){
        if (i==num.length){
            List<Integer> ans = new LinkedList<>();
            for (int j = 0; j < num.length; j++) {
                ans.add(num[j]);
            }
            res.add(ans);
        }
        boolean[] visited = new boolean[20];

        for (int j = i; j <num.length ; j++) {
            int index = num[j]+10;
            if (!visited[index]) {
                visited[index] = true;
                swap(num, i, j);
                process(num, i + 1, res);
                swap(num, i, j);
            }
        }
    }
    public  void swap(int[] num ,int i ,int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
}
