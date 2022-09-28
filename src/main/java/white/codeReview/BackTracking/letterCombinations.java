package white.codeReview.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {

    static List<String> ans = new ArrayList<>();
    static StringBuilder  builder = new StringBuilder();
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits .length() == 0){
            return ans;
        }
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        process(0,numString,digits);
        return ans;
    }

    public static void process(int time,String[] numString ,String digits){
        if (digits.length() == time){
            ans.add(builder.toString());
            return;
        }
        String str = numString[digits.charAt(time) -'0'] ;
        for (int i = 0; i < str.length(); i++) {
            builder.append(str.charAt(i));
            process(time+1,numString,digits);
            builder.deleteCharAt(builder.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
