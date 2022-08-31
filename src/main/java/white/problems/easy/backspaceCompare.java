package white.problems.easy;

public class backspaceCompare {
    public static void main(String[] args) {
        String s = "bxj##tw";
        boolean a = backspaceCompare(s, "bxo#j##tw");
        System.out.println(a);
    }
    /*public static boolean backspaceCompare1(String s, String t) {
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        int i = chars.length-1;
        int j = chars1.length-1;
        int count1 = 0;
        int count2 = 0;
        while (i>=0&&j>=0){
            if (chars[i]!='#'&&chars1[j]!='#'){
                if (chars[i]==chars1[j]){
                    i--;
                    j--;
                }else {
                    return false;
                }
            }else {
                if (chars[i]=='#'){
                    while (chars[i]=='#'){
                        i--;
                        count1++;
                    }
                }
                if (chars1[j]=='#'){
                    while (chars1[j]=='#'){
                        j--;
                        count2++;
                    }
                }
                i = i-count1;
                j = j-count2;
            }
        }
        return true;
    }*/
      public static boolean backspaceCompare(String s, String t) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c!='#'){
                a.append(c);
            }else if (a.length()>0){
                a.deleteCharAt(a.length()-1);
            }
        }
        for (char c : t.toCharArray()) {
            if (c!='#'){
                b.append(c);
            }else if (b.length()>0){
                b.deleteCharAt(b.length()-1);
            }
        }
        return a.toString().equals(b.toString());
    }
}
