package white.problems.easy;

public class ReverseLeftWords {
    public static void main(String[] args) {
        reverseLeftWords("lrloseumgh",6);
    }
    public static String reverseLeftWords(String s, int n) {
        char[] temp = new char[n];
        char[] array = s.toCharArray();
        for (int i = 0; i < n; i++) {
            temp[i] = array[i];
        }
        for (int i = n; i < array.length ; i++) {
            array[i-n] = array[i];
        }
        for (int i = 0; i <n ; i++) {
            array[array.length-n+i] = temp[i];
        }
        System.out.println(array);
        return String.valueOf(array);
    }
}
