package white.problems.medium;

public class numIslands {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[][] gird = {{1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {0,0,0,0,0}};
        numIslands test = new numIslands();
        System.out.println(test.numIslands(gird));
    }
    int count = 0;
    public int numIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j]==1){
                    count++;
                    process(grid,i,j);
                }
            }
        }
        return count;
    }



    private void process(int[][] grid, int i, int j) {
        if (i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]==0){
            return ;
        }
        grid[i][j] = 0;
        process(grid,i+1,j);
        process(grid,i-1,j);
        process(grid,i,j+1);
        process(grid,i,j-1);


    }
}
