package white.problems.medium;

public class divide {
    public static void main(String[] args) {
        System.out.println(divide(-2147483647, 2));
        System.out.println(Integer.MIN_VALUE + "   " +Integer.MAX_VALUE);
    }
    //根据楼主和评论进行改进，改为全部int型变量，通过将除数和被除数转换为负数来确保在dividend为Integer.MIN_VALUE不会溢出，再在div中检查是否发生溢出
    public static int divide(int dividend, int divisor) {
        if (divisor == 0 ) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1 ) {
            if (dividend ==Integer.MIN_VALUE) return Integer.MAX_VALUE;
            else return -dividend;
        }
        int flag = 1;
        if ((dividend>0&&divisor<0)||(dividend<0&&divisor>0)) flag = -1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int ans = process(-dividend, -divisor);
        return flag == 1 ?ans:-ans;
    }

    public static int process(int a,int b){
        if(a > b) return 0;
        int count = 1;
        int tb = b;
        while(tb+tb >= a && tb+tb < 0){ // 溢出之后不再小于0
            tb += tb;
            count += count;
        }
        return count+process(a-tb,b);
    }


}
