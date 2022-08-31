package white.problems.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class canFinish {
    public static void main(String[] args) {
        int[][] ans = {{4,1},{4,2},{2,1},{3,2},{5,4},{5,3}};
        canFinish tse = new canFinish();
        tse.can(5,ans);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree= new int[numCourses];
        List<List<Integer>> adjacency = new ArrayList<>();
        Queue<Integer> queue =new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new LinkedList<>());
        }
        for (int[] prerequisite : prerequisites) {
            inDegree[prerequisite[0]]++;
            adjacency.get(prerequisite[1]).add(prerequisite[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i]==0)
                queue.add(i);
        }
        while (!queue.isEmpty()){
            int pre = queue.poll();
            numCourses--;
            for (Integer integer : adjacency.get(pre)) {
                if (--inDegree[integer]==0) queue.add(integer);
            }
        }
        return numCourses==0;
    }

    public boolean can (int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        int[] visit = new int[numCourses];
        for (int[] cp : prerequisites) {
            adjacency.get(cp[1]).add(cp[0]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(adjacency,visit,i)) return false;
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> adjacency, int[] visit, int i) {
        if (visit[i] == 1) return false;
        if (visit[i] == -1 ) return true;
        visit[i] = 1;
        for (Integer integers : adjacency.get(i)) {
            if (!dfs(adjacency,visit,integers)) return false;
        }
        visit[i] = -1;
        return true;

    }
}
