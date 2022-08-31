package white.problems.easy;

import java.util.Stack;

public class IsValid {
    public static void main(String[] args) {
        boolean valid = isValid("({[]})");
        System.out.println(valid);
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Character out;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '(': stack.push(c); break;
                case '[': stack.push(c); break;
                case '{': stack.push(c); break;
                case ')':
                    if (stack.isEmpty()) return false;
                    out = stack.pop();
                    if (out!='(') return false; break;
                case ']':
                    if (stack.isEmpty()) return false;
                    out = stack.pop();
                    if (out!='[') return false;break;
                case '}':
                    if (stack.isEmpty()) return false;
                    out = stack.pop();
                    if (out!='{') return false;break;
            }
        }
        return stack.isEmpty();
    }
}
