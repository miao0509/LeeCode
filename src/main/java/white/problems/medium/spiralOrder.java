package white.problems.medium;

import java.util.LinkedList;
import java.util.List;

public class spiralOrder {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> list = spiralOrder(matrix);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int finish = Math.min(m, n);
        List<Integer> list = new LinkedList<>();
        int loop = n/2;
        int offset = 1;
        int x = 0;
        int y = 0;
        int midx = m/2;
        int midy = n/2;
        while (loop > 0) {
            int i = x;
            int j = y;
            for (; j < y+n-offset; j++) {
                list.add(matrix[x][j]);
            }
            for (; i < x+n-offset; i++) {
                list.add(matrix[i][j]);
            }
            for (; j > y; j--) {
                list.add(matrix[i][j]);
            }
            for (; i > x; i--){
                list.add(matrix[i][j]);
            }
            loop --;
            x++;
            y++;
            offset = offset+2;
           /* if (n%2 ==1){
                list.add()
            }*/
        }
        return list;
    }
}
