package white.problems.easy;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("hello".toCharArray());
    }
    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length-1;
        char temp;
        while (l<=r){
            temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        for (char c : s) {
            System.out.print(c + " ");
        }
    }

}
