package white.Learn.practices;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        reverse(stack);


    }
    //取出栈底元素
    public static int f(Stack<Integer> stack){
        int result = stack.pop();
        if (stack.isEmpty()){
            return result;
        }else {
            int last = f(stack);
            stack.push(result);
            return last;
        }
    }
    //把栈底元素重新压回栈头
    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }else {
            int x = f(stack);
            reverse(stack);
            stack.push(x);
        }
    }
}
