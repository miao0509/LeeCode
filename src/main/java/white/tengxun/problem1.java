package white.tengxun;

public class problem1 {
    //    char[] c = {'a','b','c','d','e','f','g'};
    StringBuilder sb = new StringBuilder();
    String a ="abcdefghijklmnopqrstuvwxyz";
    int ans = 0;

    public  int numsOfStrings(int n, int k) {
        backTracking(n,k);
        return ans %1000000;
    }

    public  void backTracking(int n, int k) {
        if (sb.length() == n) {
            if (size(sb.toString()) == k)
                ans++ ;
            return;
        }
        for (int i = 0; i < 26  ; i++) {
            sb.append(a.charAt(i));
            backTracking(n, k);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public   int size(String sb) {
        if (sb.length() == 1) return 0;
        int count = 0;
        for (int i = 0,j = 1; i < sb.length()&&j<sb.length(); ) {
            if (sb.charAt(i) == sb.charAt(j)){
                count++;
                while (j<sb.length()&&sb.charAt(j)==sb.charAt(i)){
                    j++;
                }
                i = j;
                j++;
            }else {
                j++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       problem1 problem1 = new problem1();
       System.out.println(problem1.numsOfStrings(5, 2));
    }
}
