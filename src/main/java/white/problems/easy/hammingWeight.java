package white.problems.easy;

public class hammingWeight {
    public static void main(String[] args) {
        System.out.println(010&010);
    }
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count +=(n>>i)&1;
        }
        return count;
    }
}
