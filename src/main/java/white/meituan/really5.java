package white.meituan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class really5 {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int[] p = new int[n+1];
        for (int i = 2; i <= n; i++) {
            p[i] = sc.nextInt();
        }
        int[] c = new int[n+1];
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] u = new int[m+1];
        int[] v = new int[m+1];
        for (int i = 1; i <= m; i++) {
            u[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            v[i] = sc.nextInt();
        }
        for (int i = 1; i <= m; i++) {
            List<Integer> pathu = findPath(p, u[i]);
            List<Integer> pathv = findPath(p, v[i]);
            List<Integer> com = comPath(pathu, pathv);
            count(com,c);
        }
    }
    public static int count(List<Integer> com,int[] c){
        int ans = com.get(0);
        for (int j = 1; j < com.size(); j++) {
            ans = ans ^c[com.get(j)];
        }
        System.out.print(ans + " ");
        return ans;
    }
    public static List<Integer> findPath(int[] p, int nude) {
        List<Integer> path = new ArrayList<>();
        while (nude != 1) {
            path.add(nude);
            nude = p[nude];
        }
        path.add(1);
        Collections.reverse(path);
        return path;
    }
    public static List<Integer> comPath(List<Integer> pathu,List<Integer> pathv){
        List<Integer> path = new ArrayList<>();
        int j = 0;
        while (j<pathu.size()&&j<pathv.size()&&pathu.get(j) == pathv.get(j)) {
            j++;
        }
        for (int k = j-1; k <pathu.size() ; k++) {
            path.add(pathu.get(k));
        }
        for (int k = j; k <pathv.size() ; k++) {
            path.add(pathv.get(k));
        }
        return path;
    }
}
