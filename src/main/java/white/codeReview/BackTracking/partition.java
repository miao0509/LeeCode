package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class partition {
    static List<List<String>> ans = new ArrayList<>();
    static List<String> path = new ArrayList<>();
    public static List<List<String>> partition(String s) {
        process(s,0);
        return ans;
    }
    public static void  process(String s,int index){
        if (index >= s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (isValid(s.substring(index,i+1))){
                path.add(s.substring(index,i + 1));
            }else {
                continue;
            }
            process(s,i+1);
            path.remove(path.size() - 1);
        }

    }

    public static boolean isValid(String s){
        int i = 0, j = s.length() -1;
        while (i < j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition("ababa"));
    }
}

