package white.glodon;

public class soldierTask2 {
    static int ans = Integer.MAX_VALUE;

    public static void main(String[] args) {


        int[][] a = {{1,6,2,1},{1,0,0,1},{1,0,0,1},{1,0,0,1},{1,0,4,1},{1,0,0,1},{1,0,0,1},{1,1,3,1}};
        int[][] b = {{1,2,0,0,0}, {1,6,1,1,0}, {1,1,1,1,0}, {1,0,1,0,3}};
        int time = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                if (b[i][j] == 2){
                    time = process(b, i, j,time);
                }
            }
        }
        System.out.println(ans);
    }
    public static int process(int[][] a,int i ,int j,int time) {
        if (i < 0 || i > a.length-1 || j <0 || j >a[0].length-1  || a[i][j] ==1){
            return time;
        }
        if (a[i][j] == 3){
            ans = Math.min(ans,time);
            return time;
        }
        if (a[i][j] == 6){
            if ( i + 1 <= a.length - 1 && a[i+1][j]==1) a[i+1][j] = 0;
            if (i -1 >=0 && a[i-1][j]==1) a[i-1][j] =0;
            if (j +1 <= a[0].length -1 && a[i][j+1]==1) a[i][j+1] =0;
            if (j-1>= 0 && a[i][j-1]==0) a[i][j-1] =0;
        }
        a[i][j] = 1;
        time = Math.min(process(a,i-1,j,a[i][j]==4?time+3:time+1),
                Math.min(process(a,i+1,j,a[i][j]==4?time+3:time+1),
                        Math.min(process(a,i,j-1,a[i][j]==4?time+3:time+1),
                                process(a,i,j+1,a[i][j]==4?time+3:time+1))));
        a[i][j] = 0;
        return time;
    }
}
