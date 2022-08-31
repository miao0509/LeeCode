package white.problems.easy;

public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || needle == null) return 0;
        if (haystack.length() < needle.length()) return -1;
        int k = 0;
        for (int i = 0; i < haystack.length(); i++) {
            k = i;

            for (int j = 0; j < needle.length(); j++) {
                if (i>=haystack.length()) return -1;
                if (needle.charAt(j) == haystack.charAt(i)) {
                    i++;
                    if (j == needle.length() - 1) {
                        return i - j - 1;
                    }
                } else {
                    i = k;
                    break;
                }
            }
        }
        return -1;
    }
}
