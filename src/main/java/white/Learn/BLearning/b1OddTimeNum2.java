package white.Learn.BLearning;
/*
 有两个数字 a b 出现奇数次 其他数出现偶数次 找到这两个数
 */
public class b1OddTimeNum2 {
    public static void main(String[] args) {
        int[] nums  = {1,1,2,2,333,3,3,444,444,444};
        print(nums);
    }
    public static void print(int[] nums){
        int eor = 0 ;
        for (int num : nums) {
            eor ^=num;
        }
        int rightOne =  eor &(~eor +1); //提取eor最右侧的1;
        int onlyOne = 0;
        for (int num : nums) {
            if ((num & rightOne) == 0){ // 有一位和 a ^ b不一样 那么他要么是出现偶数次 要么是a或者b
                onlyOne ^=num;
            }
        }
        System.out.println("a == " + onlyOne + "  " + "b == " + (eor ^onlyOne));

    }
}
