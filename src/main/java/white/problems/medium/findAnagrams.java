package white.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams {
    public static void main(String[] args) {
        System.out.println(findAnagrams("aa", "aaa"));
    }
    //我的愚蠢解法
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length()<p.length()) return res;
        int[][] ans = new int[s.length()-p.length()+1][26];
        int[] pnum=new int[26];

        for (int i = 0; i < p.length(); i++) {
            pnum[p.charAt(i)-'a'] ++;
        }
        for (int i = 0; i < p.length(); i++) {
            ans[0][s.charAt(i)-'a'] ++;
        }
        int pre = s.charAt(0)-'a';
        for (int i = 1; i <= s.length() - p.length(); i++) {
            System.arraycopy(ans[i - 1], 0, ans[i], 0, ans[0].length);
            ans[i][pre]--;
            int cur =s.charAt(i+p.length()-1)-'a';
            ans[i][cur]++;
            pre = s.charAt(i)-'a';
        }
        for (int i = 0; i < ans.length; i++) {
            boolean flag = true;
            for (int j = 0; j < 26; j++) {
                if (ans[i][j]!=pnum[j]){
                    flag =false;
                    break;
                }
            }
            if (flag) {
                res.add(i);
            }
        }
        return res;
    }
    //官方的聪明解法
    public List<Integer> findAnagrams1(String s, String p) {
        int sLen = s.length(), pLen = p.length();

        if (sLen < pLen) {
            return new ArrayList<Integer>();
        }

        List<Integer> ans = new ArrayList<Integer>();
        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; ++i) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }

        if (Arrays.equals(sCount, pCount)) {
            ans.add(0);
        }

        for (int i = 0; i < sLen - pLen; ++i) {
            --sCount[s.charAt(i) - 'a'];
            ++sCount[s.charAt(i + pLen) - 'a'];

            if (Arrays.equals(sCount, pCount)) {
                ans.add(i + 1);
            }
        }

        return ans;
    }

}
