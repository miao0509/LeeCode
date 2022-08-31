package white.problems.medium;

public class IntToRoman {
    public static String intToRoman(int num) {
        String ans = "";
        int m = num/1000;
        for (int i = 0; i < m; i++) {
            ans +="M"; 
        }
        num = num-m*1000;
        int c = num/100;
        if (c == 9) ans+="CM";
        else if (c >=5) {
            ans += "D";
            for (int i = 0; i < c - 5; i++) {
                ans += "C";
            }
        }else {
            for (int i = 0; i < c ; i++) {
                ans += "C";
            }
        }
        num = num-c*100;
        int x = num/10;
        if (x == 9) ans+="XC";
        else if (x >=5){
            ans +="L";
            for (int i = 0; i < x - 5; i++) {
                ans+="X";
            }
        }else {
            for (int i = 0; i < x; i++) {
                ans +="X";
            }
        }
        int i = num = num%10;
        if (i==9){
            ans+="IX";
        }else if (i>=5){
            ans +="V";
            for (int j = 0; j < i - 5; j++) {
                ans+="I";
            }
        }else if(i==4){
            ans +="IV";

        }else {
            for (int j = 0; j < i; j++) {
                ans +="I";
            }
        }
        return ans;
    }
}
