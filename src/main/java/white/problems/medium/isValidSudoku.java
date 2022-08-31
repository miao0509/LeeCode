package white.problems.medium;

public class isValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            int[] flag = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] !='.') {
                    if (flag[board[i][j]-'1']!=0) {
                        return false;
                    }else {
                        flag[board[i][j]-'1']=1;
                    }
                }
            }
        }
        for (int j = 0; j < 9; j++) {
            int[] flag = new int[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] !='.') {
                    if (flag[board[i][j]-'1']!=0) {
                        return false;
                    }else {
                        flag[board[i][j]-'1']=1;
                    }
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i %3==0&&j%3==0){
                    if (!valid(i,board))  return false;
                }
            }
        }
        return true;
    }

    public boolean valid(int start,char[][] board){
        int[] flag = new int[9];
        for (int i = start; i <start+3 ; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] !='.'){
                    if (flag[board[i][j]-'1']!=0) {
                        return false;
                    }else {
                        flag[board[i][j]-'1']=1;
                    }
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku1(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] subboxes = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    rows[i][index]++;
                    columns[j][index]++;
                    subboxes[i / 3][j / 3][index]++;
                    if (rows[i][index] > 1 || columns[j][index] > 1 || subboxes[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
