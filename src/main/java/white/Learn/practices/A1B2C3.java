package white.Learn.practices;

/**
 * 1对应A 2 对应B
 * 111 可以是 AAA AK  KA
 * 问xxx 有多少种可能的组合
 */
public class A1B2C3 {
    public static void main(String[] args) {
        String str = "111";
        int f = f(str);
        System.out.println(f);
    }
    public static int f(String str){
        char[] chars = str.toCharArray();
        int i = process(chars, 0);
        return i;
    }

    public static int process(char[] chars,int i){
        //之前做的决定
        if (i == chars.length){
            return 1;
        }
        if (chars[i]=='0') return 0;
        if (chars[i] =='1'){
            int res = process(chars,i+1);
            if (i+1<chars.length){
                res +=process(chars,i+2);
            }
            return res;
        }
        if (chars[i]=='2'){
            int res = process(chars,i+1);
            if (i+1<chars.length&&chars[i+1]<'7'&&chars[i+1]>='0'){
                res +=process(chars,i+2);
            }
            return res;
        }
        //不是数字
        return process(chars,i+1);
    }
}
