package white.problems.easy;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int[] num1 = {1,2,2,3};
        int[] num2 = {2};
        int[] intersection = intersection(num1, num2);
        for (int i : intersection) {
            System.out.println(i);
        }
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        for (int i : nums1) {
            if (!map.containsKey(i)){
                map.put(i,1);
            }else {
                Integer integer = map.get(i);
                map.put(i,++integer);
            }
        }
        for (int i : nums2) {
            if (map.containsKey(i)&&map.get(i)!=0){
                list.add(i);
                Integer integer = map.get(i);
                map.put(i,--integer);
            }
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for (Integer integer : list) {
            ans[i++] = integer;
        }
        return ans;
    }
}
