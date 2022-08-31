package white.problems.medium;

import java.util.*;

public class dailyTemperatures {
    public static void main(String[] args) {
        int[] temperatures = {89,62,70,58,47,47,46,76,100,70};
        int[] ans = dailyTemperatures(temperatures);
        List<Integer> list = new ArrayList<>();
        for (int an : ans) {
            list.add(an);
        }
        System.out.println(list);
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int max = Integer.MAX_VALUE;
            int count = 1;
            for (int j = i+1; j < temperatures.length; j++) {
                if (temperatures[j]<=temperatures[i]){
                    count++;
                }else {
                    ans[i] = count;
                    break;
                }
            }
        }
        return ans;
    }
    public int[] dailyTemperatures1(int[] temperatures) {

        int lens=temperatures.length;
        int []res=new int[lens];

        /*
         如果当前遍历的元素 大于栈顶元素，表示 栈顶元素的 右边的最大的元素就是 当前遍历的元素，
         所以弹出 栈顶元素，并记录
         如果栈不空的话，还要考虑新的栈顶与当前元素的大小关系
         否则的话，可以直接入栈。
         注意，单调栈里 加入的元素是 下标。
         */
        Deque<Integer> stack=new LinkedList<>();
        stack.push(0);
        for(int i=1;i<lens;i++){

            if(temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    res[stack.peek()]=i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }

        return  res;
    }
    public int[] dailyTemperatures2(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i]<=temperatures[stack.peek()]){
                stack.push(i);
            }else {
                while (!stack.isEmpty()&&temperatures[i]>temperatures[stack.peek()]){
                    res[stack.peek()] = i - stack.pop();
                }
                stack.push(i);
            }
        }
        return res;
    }

}
