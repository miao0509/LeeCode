package white.problems.easy;

public class countBits {
    public static void main(String[] args) {
        int[] ints = countBits(5);
        System.out.println();
    }
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++)
         {
             int temp = i;
             int count = 0;
             while (temp!=0){
                 int x = temp & 1;
                 if (x!=0) {
                     count++;
                 }
                 temp = temp>>1;
             }
             ans[i] = count;
        }
        return ans;
    }
}
