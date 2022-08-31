package white.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    public static void main(String[] args)  {
        boolean anagram = isAnagram("aabcc", "ccaab");
        System.out.println(anagram);
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i)-'a']--;
        }
        for (int i : count) {
            if (i !=0) return false;
        }
        return true;
    }
}
