package white.problems.easy;

import java.util.Stack;

public class removeDuplicates2 {
    public static void main(String[] args) {
        String abbaca = removeDuplicates("abbaca");
        System.out.println(abbaca);
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        char out;
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
            }
            else {
                out = stack.peek();
                if (out == s.charAt(i)) stack.pop();
                else stack.push(s.charAt(i));
            }
        }
        char[] c = new char[stack.size()];
        int i = stack.size()-1;
        while (!stack.isEmpty()) {
            c[i--]=stack.pop();
        }
        return String.valueOf(c);
        /*
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();
        */
    }
}
