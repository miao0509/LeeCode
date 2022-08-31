package white.problems.medium;

import java.util.LinkedList;
import java.util.Queue;

public class movingCount {
    public static void main(String[] args) {
        System.out.println(movingCount1(16, 8, 4));
    }

    public static int movingCount(int m, int n, int k) {
        if (k == 0) return 1;
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] visited = new boolean[m][n];
        queue.add(new int[]{0, 0});
        visited[0][0] = true;
        int count = 1;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0], y = poll[1];
            for (int i = 0; i < 2; i++) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty < 0 || ty >= n || visited[tx][ty] || sum(tx) + sum(ty) > k)
                    continue;
                visited[tx][ty] = true;
                queue.add(new int[]{tx, ty});
                count++;
            }
        }
        return count;
    }
    static int m1 ,n1,k1;
    static boolean[][]visited;
    public static int movingCount1(int m, int n, int k) {
        visited = new boolean[m][n];
        m1=m;n1=n;k1=k;
        return dfs(0, 0,0,0);
    }
    public static int dfs(int x,int y,int a,int b ){
        if (x <0||x>=m1||y<0||y>=n1||a+b>k1||visited[x][y]) return 0;
        visited[x][y] = true;
        return 1+dfs(x+1,y,sum(x+1),sum(y))+dfs(x,y+1,sum(x),sum(y+1))+dfs(x-1,y,sum(x-1),sum(y))+dfs(x,y-1,sum(x),sum(y-1));
    }
    public static int sum(int x) {
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        return sum;
    }
}
