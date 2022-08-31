package white.problems.medium;

import java.util.LinkedList;

public class decodeString {
    public static void main(String[] args) {

        System.out.println(decodeString("10[leecode]"));
    }
    public static String decodeString(String s) {
        StringBuilder res= new StringBuilder();
        int mut = 0;
        LinkedList<Integer> stack_mut= new LinkedList<>();
        LinkedList<String> stack_res= new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c=='['){
                stack_mut.addLast(mut);
                stack_res.addLast(res.toString());
                mut = 0;
                res = new StringBuilder();
            }else if (c==']'){
                StringBuilder tmp = new StringBuilder();
                Integer cur_mul = stack_mut.removeLast();
                for (int i = 0; i < cur_mul; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stack_res.removeLast()+tmp);
            }else if (c >='0'&&c<='9') {
                mut = mut * 10 + c-'0';
            }else {
                res.append(c);
            }

        }
        return res.toString();
    }
}
