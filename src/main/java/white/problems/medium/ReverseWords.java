package white.problems.medium;

public class ReverseWords {

    public static void main(String[] args) {
        String s1 = reverseWords(" asdasd df f");
        System.out.println(s1);

    }
     public static String reverseWords(String s) {
         long start = System.nanoTime();
         String no_kong = removeKong(s.toCharArray());
         long start1 = System.nanoTime();
         String reverse = reverse(no_kong.toCharArray(), 0, no_kong.length() - 1);
         long start2 = System.nanoTime();
         String s1 = reverseEachWord(reverse);
         long start3 = System.nanoTime();
         System.out.println(start1-start);
         System.out.println(start2-start1);
         System.out.println(start3-start2);
         return s1;
     }

    /**
     * 反转字符串
     * @param array
     * @param start 起始
     * @param end 截至 （包括end）
     * @return
     */
    public static String reverse(char[] array, int start, int end) {
        char temp;
        int j = end;
        int i = start;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(array);
    }

    public static String reverseEachWord(String s) {
        int i = 0;
        char[] chars = s.toCharArray();
        String ans = "";
        for (int k = 0; k < s.length(); k++) {
            if (chars[k] == ' ') {
                String reverse = reverse(chars, i, k-1);
                i = k+1;
            }
        }
        String reverse = reverse(chars, i, chars.length - 1);
        return reverse;
    }


    public static String removeKong(char[] array) {
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == ' ' && array[i - 1] == ' ') j++;
            else array[i - j] = array[i];
        }
        int length = array.length - j;
        int control = 0;
        if (array[0] == ' ') {
            length--;
            control++;
        }
        if (array[array.length - 1] == ' ') {
            length--;
            control++;
        }
        char[] ans = new char[length];
        for (int i = 0, k = 0; i < length + control && k < length; i++) {
            if (i == 0 && array[i] == ' ') continue;
            if (i == length+control - 1 && array[i] == ' ') continue;
            ans[k++] = array[i];
        }
        return String.valueOf(ans);
        /*int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char c = s.charAt(start);
            if (c != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb.toString();*/
    }
}
