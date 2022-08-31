package white.problems.easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s==""||s.length()==0){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        char c ='0';
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]){
                case '(': stack.push(chars[i]) ;break;
                case '[': stack.push(chars[i]) ;break;
                case '{': stack.push(chars[i]) ;break;
                case ')':
                    if (!stack.empty()) {
                        c = stack.pop();
                        if (c != '(')
                            return false;
                        break;
                    }
                    return false;
                case ']':
                    if (!stack.empty()) {
                        c = stack.pop();
                        if (c!='[')
                            return false;
                        break;
                    }
                    return false;
                case '}':
                    if (!stack.empty()) {
                        c = stack.pop();
                        if (c!='{')
                            return false;
                        break;
                    }
                    return false;
                default:
                    return false;
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }

}
