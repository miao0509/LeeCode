package white.problems.easy;

public class isPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(2147483647));
    }
    public static boolean isPerfectSquare(int num) {
        int l = 0;
        int r = num;
        int mid;
        while(l<=r){
            mid = l+(r-l)/2;
            if ((long)mid*mid==num) return true;
            if ((long)mid*mid<num) l = mid+1;
            if ((long)mid*mid>num) r = mid -1;
        }
        return false;
    }
}
