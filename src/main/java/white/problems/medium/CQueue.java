package white.problems.medium;

import java.util.Stack;

public class CQueue {
    Stack<Integer> stackIn ;
    Stack<Integer> stackOut ;
    public CQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void appendTail(int value) {
        stackIn.push(value);
    }

    public int deleteHead() {
        if (!stackOut.isEmpty()) return stackOut.pop();
        while (!stackIn.empty()){
            stackOut.push(stackIn.pop());
        }
        return stackOut.empty()?-1:stackOut.pop();
    }
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int pre = 0;
        int cur = 1;
        int ans = 0;
        while (n >1){
            ans = pre+cur;
            pre = cur;
            cur = ans;
            n--;
        }
        return ans;

    }
}

