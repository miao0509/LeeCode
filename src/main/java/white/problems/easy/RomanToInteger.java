package white.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < c.length-1; i++) {
                if(map.get(c[i])>=map.get(c[i+1])){
                    sum = sum+map.get(c[i]);
                }else {
                    sum = sum-map.get(c[i]);
                }
        }
        sum=sum+map.get(c[c.length-1]);
        return sum;
    }
}
