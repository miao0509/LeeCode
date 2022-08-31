package white.Learn.practices;

/**
 * 01背包问题
 */
public class OneZeroBag {
    public static int process(int alreadyWeight,int bag,int[] weight,int[] value,int i){
        if (alreadyWeight>bag){
            return 0;
        }
        if (i == weight.length){
            return 0;
        }
        return Math.max(process(alreadyWeight,bag,weight,value,i+1),//不要当前的i
               value[i]+  process(alreadyWeight+weight[i],bag,weight,value,i+1));
    }
}
