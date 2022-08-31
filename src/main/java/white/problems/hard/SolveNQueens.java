package white.problems.hard;

import java.util.ArrayList;
import java.util.List;
//为什么五皇后 24135可以  24153就不行？
public class SolveNQueens {
    public static void main(String[] args) {
        SolveNQueens test = new SolveNQueens();
        List<List<String>> lists = test.solveNQueens(4);
        System.out.println(lists);
    }
    List<String> path = new ArrayList<>();
    List<List<String>> ans = new ArrayList<>();
    String s="";
    public List<List<String>> solveNQueens(int n) {
        if (n==1){
            path.add("Q");
            ans.add(new ArrayList<>(path));
            return ans;
        }
        if (n==2){
           return ans;
        }
        boolean[][] use = new boolean[n][n];
        this.initPath(n);
        backTracking(n,-1,use);
        return ans;
    }
    //index代表上一行是第几行 -1代表第一行上面
    public void backTracking(int n,int index,boolean[][] use){

        if (index==n-1){
            ans.add(new ArrayList<>(path));
//            initPath(n);
            return;
        }
        for (int i = 0; i <n ; i++) {
            //不是第一行，分为最左边，最右边，和其他
            if (index==-1||i==0&&isValid(use,i)&&use[index][i+1]==false||//最左边
                i==n-1&&isValid(use,i)&&use[index][i-1]==false||//最右边
                i>0&&i<n-1&&isValid(use,i)&&use[index][i-1]==false&&use[index][i+1]==false){//其他
                replaceCharAt(i, path.get(index + 1),'Q');
                path.set(index+1,s);
                use[index+1][i]=true;
                backTracking(n,index+1,use);
                use[index+1][i]=false;
                replaceCharAt(i, path.get(index + 1),'.');
                path.set(index+1,s);
            }
        }
    }
    //index代表列
    public boolean isValid(boolean[][] use,int index){
        int len = use[0].length;
        for (int i = 0; i < len; i++) {
            if (use[i][index]) return false;
        }
        return true;
    }
    public List<String> initPath(int n){
        for (int i = 0; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < n; j++) {
                builder.append(".");
            }
            path.add(builder.toString());
        }
        return path;
    }
    public void replaceCharAt(int i,String s,char c){
        char[] chars = s.toCharArray();
        chars[i] = c;
        this.s=String.valueOf(chars);

    }
}
