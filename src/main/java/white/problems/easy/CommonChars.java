package white.problems.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonChars {
    public static void main(String[] args) {
        String[] words = {"bella", "label", "roller"};
        List<String> strings = commonChars(words);
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) return result;
        int[] hash= new int[26]; // 用来统计所有字符串里字符出现的最小频率
        for (int i = 0; i < words[0].length(); i++) { // 用第一个字符串给hash初始化
            hash[words[0].charAt(i)- 'a']++;
        }
        // 统计除第一个字符串外字符的出现频率
        for (int i = 1; i < words.length; i++) {
            int[] hashOtherStr= new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                hashOtherStr[words[i].charAt(j)- 'a']++;
            }
            // 更新hash，保证hash里统计26个字符在所有字符串里出现的最小次数
            for (int k = 0; k < 26; k++) {
                hash[k] = Math.min(hash[k], hashOtherStr[k]);
            }
        }
        // 将hash统计的字符次数，转成输出形式
        for (int i = 0; i < 26; i++) {
            while (hash[i] != 0) { // 注意这里是while，多个重复的字符
                char c= (char) (i+'a');
                result.add(String.valueOf(c));
                hash[i]--;
            }
        }
        return result;
    }
}
