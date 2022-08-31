package white.problems.medium;

public class exist {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(dfs(board, words, i, j, 0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i >= board.length || i < 0 || j >= board[0].length || j < 0 || board[i][j] != word[k]) return false;
        if(k == word.length - 1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board, word, i + 1, j, k + 1) || dfs(board, word, i - 1, j, k + 1) ||
                dfs(board, word, i, j + 1, k + 1) || dfs(board, word, i , j - 1, k + 1);
        board[i][j] = word[k];
        return res;
    }
    public boolean exist1(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (travel(board,chars,i,j,0)) return true;
            }
        }
        return false;
    }

    private boolean travel(char[][] board,  char[] word, int i, int j, int k) {
        if (i>board.length -1||i<0||j>board[0].length-1||j<0||board[i][j]!=word[k]) return false;
        if (k == word.length-1) return true;
        board[i][j] = '0';
        boolean ans = travel(board,word,i+1,j,k+1)||travel(board,word,i-1,j,k+1)||travel(board,word,i,j+1,k+1)||travel(board,word,i,j-1,k+1);
        board[i][j] = word[k];
        return ans;
    }
}
