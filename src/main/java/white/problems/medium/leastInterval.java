package white.problems.medium;

import java.util.*;

public class leastInterval {
    public static void main(String[] args) {
        char[] chars={'A','A','B','C','C','C','C','C'};
        System.out.println(leastInterval(chars, 2));
    }
    public static int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> map = new TreeMap<>();
        List<Character> ans = new ArrayList<>();
        for (char c : tasks) {
            map.put(c,map.getOrDefault(c,0)+1);
        }
       int size = map.size();
        return 1;
    }
}
