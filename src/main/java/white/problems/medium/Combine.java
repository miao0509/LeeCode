package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    public static void main(String[] args) {
        combine(4,2);
        System.out.println(ans);
    }
    private static List<List<Integer>> ans = new ArrayList<>();
    private static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> combine(int n, int k) {
        backTracking(n,k,1);
        return ans;
    }

    static void backTracking(int n , int k ,int start){ // start ：第一个取值的位置，取过就加一 ，以后不再取。
        if (path.size() == k) {
            ans.add(new ArrayList<>(path));//之所以new一个 是因为不拷贝一份的话，26行的代码会把元素移除
            return;
        }
        //从n-(k-path.size())+1后的位置开始， 元素都不够K个 所以直接不遍历了
        for (int i = start; i <=n - (k - path.size()) +1; i++) {
            path.add(i);
            backTracking(n,k,i+1);
            path.remove(path.size()-1);
        }
    }
}
