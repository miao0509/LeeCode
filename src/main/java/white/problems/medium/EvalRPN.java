package white.problems.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class EvalRPN {
    public static void main(String[] args) {
        String[] s = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int i = evalRPN(s);
        System.out.println(i);
    }
    public static int evalRPN(String[] tokens) {
        int a,b;
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (!"+/-*".contains(token)){
                stack.push(token);
            }else if (token.equals("+")){
//                stack.pop();
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a+b));
            }else if (token.equals("-")){
//                stack.pop();
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b-a));
            }else if (token.equals("*")){
//                stack.pop();
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(a*b));
            }else if (token.equals("/")){
//                stack.pop();
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(b/a));
            }
        }
        return Integer.parseInt(stack.pop());

    }
}
