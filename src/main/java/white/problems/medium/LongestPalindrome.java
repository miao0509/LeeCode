package white.problems.medium;

public class LongestPalindrome {
    //暴力 超时
    public static String longestPalindrome(String s) {
        String ans = s.substring(0, 1);
        if (s.length() == 1) return ans;
        int length = 1;
        int max = 1;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                /*String current = s.substring(i, j + 1);
                flag = isPalindrome(current);
                if (!flag) continue;
                if (flag) {
                    length = current.length();
                }
                if (length > max) {
                    max = length;
                    ans = current;
                }*/
            }
        }
        return ans;
    }

    public static Boolean isPalindrome(String s) {
        boolean flag = true;
        for (int left = 0; left <= s.length() / 2; left++) {
            if (s.charAt(left) != s.charAt(s.length() - left - 1)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static String longestPalindrome2(String s) {
        return null;
    }
}
