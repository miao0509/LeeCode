package white.problems.easy;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a = 0;
        int b = 0;
        int c = x;
        while(x!= 0){
            b = x%10;
            a = a*10 + b;
            x = x/10;
        }
        if( c == a){
            return true;
        }
        return false;
    }
}
