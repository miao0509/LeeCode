package white.problems.easy;
//抄答案的，这个是错的
public class FindContentChildren {
    public static void main(String[] args) {
        FindContentChildren test = new FindContentChildren();
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        int ans = test.findContentChildren(g, s);
        System.out.println(ans);
    }
    public int findContentChildren(int[] g, int[] s) {
        if (g.length==0||s.length==0) return 0;
        int ans=0;
        int[] flag=new int[s.length];
        int cha=0;
        int index=-1;//差距最小的下标;
        for (int i = 0; i < g.length; i++) {
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < s.length; j++) {
                cha=s[j]-g[i];
                if (cha<0) continue;//不满足
                if (cha==0&&flag[j]!=1){//刚好满足
                    flag[j]=1;
                    ans++;
                    break;
                }
                if (cha<min){//找到差值最小的了
                    min = cha;
                    index = j;
                }
            }
            if (index>0&&flag[index]!=1){
                flag[index]=1;
                ans++;
            }
        }
        return ans;
    }
}
