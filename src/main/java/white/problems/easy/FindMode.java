package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.*;

public class FindMode {
    int count= 1;
    int max= 1;
    TreeNode pre = null;
    List<Integer> list = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();
    public  int[] findMode(TreeNode root) {
        travel(root);
        /*for (Integer value : map.values()) {
            max = Math.max(max,value);
        }
        for (Integer integer : map.keySet()) {
            if (map.get(integer)==max) list.add(integer);
        }*/
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]  = list.get(i);
        }
        return ans;
    }
    public  void travel(TreeNode treeNode){
        if (treeNode == null) return;
        travel(treeNode.left);
        if (!map.containsKey(treeNode.val)) map.put(treeNode.val,1);
        if (pre!=null&&pre.val==treeNode.val){
//            count = map.getOrDefault(treeNode.val,0)+1;
            count = map.get(treeNode.val)+1;
            map.put(treeNode.val,count);
            max  = Math.max(count,max);
        }
        pre = treeNode;
        travel(treeNode.right);
    }

    public void travel1(TreeNode root){
        if (root==null) return;
        travel(root.left);
        if (pre == null||pre.val!=root.val){
            count = 1;
        }else {
            count++;
        }
        if (count == max){
            list.add(root.val);
        }
        if (count>max){
            list.clear();
            list.add(root.val);
            max = count;
        }
        pre  = root;
        travel1(root.right);
    }
}
