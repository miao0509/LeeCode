package white.problems.easy;

public class minArray {
    public static void main(String[] args) {
        int[]a  = {1,3,5};
        System.out.println(minArray(a));
    }
    public static int minArray(int[] numbers) {
        if (numbers.length == 1) return numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) return numbers[i];
        }
        return numbers[0];
    }
}
