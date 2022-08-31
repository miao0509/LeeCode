package white;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class test {
    static void sortMap(Map<Integer, Integer>param) {
        TreeMap<Integer, Integer> paramTreeMap = new TreeMap<Integer, Integer>(param);
        System.out.println(paramTreeMap);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list.remove(list.size() - 1));
        System.out.println(list.remove(list.size() - 1));

    }
}
