package white.problems.medium;

public class countAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(5));
    }
    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String pre = countAndSay(n - 1);
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < pre.length(); ) {
            int count = 0;
            int val = pre.charAt(i) - '0';
            int p = pre.charAt(i);
            while (i < pre.length() &&p == pre.charAt(i)) {
                p = pre.charAt(i);
                count++;
                i++;
            }
            ans.append(count).append(val);
        }
        return ans.toString();
    }
    public static String test(String pre){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < pre.length(); ) {
            int count = 0;
            int val = pre.charAt(i) - '0';
            int p = pre.charAt(i);
            while (i < pre.length() &&p == pre.charAt(i)) {
                p = pre.charAt(i);
                count++;
                i++;
            }
            ans.append(count).append(val);
        }
        return ans.toString();
    }
}
