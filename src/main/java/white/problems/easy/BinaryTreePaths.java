package white.problems.easy;

import white.problems.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root==null) return ans;
        List<Integer> path = new ArrayList<>();
        travel(root,path,ans);
        return ans;
    }

    public static void travel(TreeNode root,List<Integer> path,List<String> res){
        path.add(root.val);
        if (root.left==null&&root.right ==null){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size()-1));
            res.add(sb.toString());
            return;
        }
        if (root.left!=null) {
            travel(root.left,path,res);
            path.remove(path.size()-1);
        }
        if (root.right!=null) {
            travel(root.right,path,res);
            path.remove(path.size()-1);
        }
    }
}
