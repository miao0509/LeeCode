package white.tengxun;

public class problem3 {
    //s <2^17
    public static int minCnt (String s) {
        // write code here
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        return  count - 1;
    }

    public static void main(String[] args) {
        System.out.println(minCnt("011101"));
    }

}
