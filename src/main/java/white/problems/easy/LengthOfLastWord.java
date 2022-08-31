package white.problems.easy;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int length = 0;
        char[] c = s.toCharArray();
        int i = c.length - 1;
        while (c[i] == ' ') {
            i--;
        }
        while (i >= 0&&c[i] != ' ') {
            length++;
            i--;
        }
        return length;
    }
}
