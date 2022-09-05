package white.meituan;

import java.util.*;

public class zhuanghu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] father = new int[total+1];
        for (int i = 2; i <= total; i++) {
            father[i] = sc.nextInt();
        }
        sc.nextLine();
        String s = sc.nextLine();
        int[] process = process( father, (" "+s).toCharArray());
        for (int i = 1; i < process.length; i++) {
            System.out.print(process[i] +" ");
        }
    }
    public static int[] process(int[] father ,char[] s){
       String[] ans = new String[father.length];
        Arrays.fill(ans, "");
        for (int i = father.length-1; i > 0; i--) {
            ans[i] +=s[i];
            ans[father[i]]+=ans[i];
        }
        int[] h = new int[father.length];
        for (int i = 1; i < father.length ; i++) {
            String s1 = sort2(ans[i]);
            h[i] = s1.length();
        }
        return h;
    }
    public static String sort2(String str) {

        String[] chars = str.split("");

        TreeSet<String> treeSet = new TreeSet();
        for (String s : chars) {
            treeSet.add(s);
        }

        str = "";
        for (String s : treeSet) {
            str += s;
        }
        return str;
    }
}
