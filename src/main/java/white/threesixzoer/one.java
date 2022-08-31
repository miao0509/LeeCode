package white.threesixzoer;

import java.util.*;

public class one {
    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        back(str.toCharArray(),0,new StringBuilder());
        Map<String,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (String s : list) {
            if (s.equals("")) continue;
            Integer value = map.getOrDefault(s, 0);
            value++;
            max = Math.max(value,max);
            map.put(s,value);
        }
        System.out.println(max);
    }

    public static void back(char[] c,int index,StringBuilder s){
        list.add(s.toString());
        if (index == c.length){
            return;
        }
        for (int i = index; i <c.length; i++) {
            s.append(c[i]);
            back(c,i+1,s);
            s.deleteCharAt(s.length()-1);
        }
    }
}
