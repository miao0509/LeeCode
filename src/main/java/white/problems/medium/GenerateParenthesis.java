package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    List<String> ans = new ArrayList<>();

    public static void main(String[] args) {
        GenerateParenthesis test = new GenerateParenthesis();
        test.generateParenthe(3);
        System.out.println(test.ans);
    }

    public List<String> generateParenthe(int n) {
        String m = "()";
        StringBuilder builder = new StringBuilder("(");
        find(n, builder, m);
        return ans;
    }

    public void find(int n, StringBuilder s, String m) {
        if (s.length() == n * 2 ) {
            if ( valid(s.toString().toCharArray())) {
                ans.add(new String(s));
                s = null;
            }
            return;
        }
        for (int i = 0; i < 2; i++) {
            s.append(m.charAt(i));
            find(n,s,m);
            s.deleteCharAt(s.length() -1);
        }
    }

    public boolean valid(char[] c) {
        if (c.length % 2 != 0) return false;
        int balance = 0;
        for (char c1 : c) {
            if (c1 == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;

    }
}
