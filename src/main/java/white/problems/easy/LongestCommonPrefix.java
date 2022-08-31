package white.problems.easy;


public class LongestCommonPrefix {
    public static String solution(String[] strs) {
        String s = "";
        String ans = "";
        int k=0;
        boolean flag = false;

        for (int i = 0; i < strs.length; i++,k++) {
            for (int j = 0; j < strs.length&&k<strs[j].length();j++) {
                s =s+strs[j].charAt(k);
            }
            if (s.length()==1){
                flag =true;
                break;

            }
            for (int j = 0; j < s.length()-1; j++) {
                if(s.charAt(j)!=s.charAt(j+1)){
                    flag = true;
                    break;
                }
            }
            if (flag){
                break;
            }
            if (!s.isEmpty()){

                ans =ans+ s.charAt(0);
            }
            s= "";

        }
        return ans;
    }
}
