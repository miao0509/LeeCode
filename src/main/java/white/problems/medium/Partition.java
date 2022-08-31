package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class Partition {
    public static void main(String[] args) {
        Partition test = new Partition();
        List<List<String>> aa = test.partition("aba");
        for (List<String> strings : aa) {
            System.out.println(strings);
        }
    }
    String builder ="";
    List<String> path = new ArrayList<>();
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backTracking(s,0);
        return ans;
    }
    public void backTracking(String s, int index){
        if (index>=s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < s.length(); i++) {
            if (isHui(s.substring(index,i+1))){
                path.add(s.substring(index,i+1));
            }else {
                continue;
            }
            backTracking(s,i+1);
            path.remove(path.size()-1);
        }
    }
    public boolean isHui(String s){
        int start = 0;
        int end = s.length()-1;
        while (end>=start){
            if (!(s.charAt(start++)==s.charAt(end--)))return false;
        }
        return true;
    }
}
