package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class pathSum3 {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int res = rootSum(root, targetSum);
        res += pathSum(root.left, targetSum);//以每个节点都为起点
        res += pathSum(root.right, targetSum);
        return res;
    }

    private int rootSum(TreeNode root, int targetSum) {
        int res = 0;
        if(root==null) return 0;
        int val = root.val;
        if (val==targetSum){
            res++;
        }
        res +=rootSum(root.left,targetSum-val);
        res +=rootSum(root.right,targetSum-val);
        return res;
    }
    public int pathSum1(TreeNode root, int targetSum) {
        Map<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L,1);
        return dfs(root,prefix,0,targetSum);
    }

    private int dfs(TreeNode root, Map<Long, Integer> prefix, long cur, int targetSum) {
        if (root==null) return 0;
        int res = 0;
        cur +=root.val;
        res = prefix.getOrDefault(cur-targetSum,0);
        prefix.put(cur,prefix.getOrDefault(cur,0)+1);
        res +=dfs(root.left,prefix,cur,targetSum);
        res +=dfs(root.right,prefix,cur,targetSum);
        //回退到上一层 这时候已经不是前缀了 要删除
        prefix.put(cur,prefix.getOrDefault(cur,0)-1);
        return res;
    }

}
