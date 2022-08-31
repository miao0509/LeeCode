package white.problems.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {

    private String letterMap[] = {
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };

    /*
        private ArrayList<String> res;

        public List<String> letterCombinations(String digits) {

            res = new ArrayList<String>();
            if(digits.equals(""))
                return res;

            findCombination(digits, 0, "");
            return res;
        }

        private void findCombination(String digits, int index, String s){

            if(index == digits.length()){
                res.add(s);
                return;
            }

            Character c = digits.charAt(index);
            String letters = letterMap[c - '0'];
            for(int i = 0 ; i < letters.length() ; i ++){
                findCombination(digits, index+1, s + letters.charAt(i));
            }

            return;
        }
    */
    private ArrayList<String> res = new ArrayList<>();
    private StringBuilder s = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        if ("".equals(digits)) return res;
        backTracking(digits, 0);
        return res;
    }

    public void backTracking(String digits, int index) {
        if (index == digits.length()) {
            res.add(s.toString());
            return;
        }
        int cur = digits.charAt(index) - '0';
        String curS = letterMap[cur];
        for (int i = 0; i <= curS.length(); i++) {
            s.append(curS.charAt(i));
            backTracking(digits, index + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

}
