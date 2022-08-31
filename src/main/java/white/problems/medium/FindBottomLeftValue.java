package white.problems.medium;

import white.problems.utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class FindBottomLeftValue {
    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        one.left = two;
        one.right = three;
        two.left = four;
        three.left = five;
        three.right = six;
        five.left = seven;
        int bottomLeftValue = findBottomLeftValue(one);
        System.out.println(bottomLeftValue);

    }
    public static int findBottomLeftValue(TreeNode root) {
        TreeNode ans = root ;
        Queue<Object> queue = new LinkedList<>();
        queue.add(root);
        queue.add(1);
        while (!queue.isEmpty()){
            int size = queue.size();
            int count = 1;
            while (size>0){
                TreeNode p  = (TreeNode) queue.poll();
                int c = (int) queue.poll();  //当前层第几个节点； 第一个就是最左边的；
                if (c == 1) ans = p;
                if (p.left!=null){
                    queue.add(p.left);
                    queue.add(count++);
                }
                if (p.right!=null){
                    queue.add(p.right);
                    queue.add(count++);
                }
                size--;
                size--;
            }
        }
        return ans.val;
    }
}
