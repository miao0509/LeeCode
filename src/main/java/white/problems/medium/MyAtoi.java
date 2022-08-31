package white.problems.medium;

/**
 * 没做 垃圾题目
 */
public class MyAtoi {
    public static int myAtoi(String s) {
        int ans = 0;
        boolean flag = false;//是否遇到最后一个数字 是则退出
        String p = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-'&&!flag) {
                p = p + c;
            }
            if (c < 48 || c > 57) {
                if (flag) break;
//                continue;
            } else {
                flag = true;
                p = p + c;
            }
        }
        long i = Long.parseLong(p);
        if (i > Integer.MAX_VALUE) i = Integer.MAX_VALUE;
        ans = (int) i;
        return ans;
    }
}
