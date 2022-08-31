package white.problems.medium;

public class findNumberIn2DArray {
    int[][] matrix = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
    int[][] a = {};

    public static void main(String[] args) {
        findNumberIn2DArray tst = new findNumberIn2DArray();
        System.out.println(tst.findNumberIn2DArray(tst.a, 20));
    }
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0)  return false;
        int m = matrix[0].length;
        if (m == 0) return false;
        for (int i = m -1,j = 0; i >=0 && j <=n -1 ; ) {
            if (target == matrix[j][i]) return true;
            else if (target > matrix[j][i]) j++;
            else  i--;
        }
        return false;
    }

}
