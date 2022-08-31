package white.problems.hard;

public class Candy {
    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] test1 = {1,0,2};
        int[] test2 = {1,2,2};
        int[] test3 = {1,3,2,2,1};
        int[] test4 = {1,2,87,87,87,2,1};
        System.out.println(candy.candy(test1));
        System.out.println(candy.candy(test2));
        System.out.println(candy.candy(test3));
        System.out.println(candy.candy(test4));

    }
    public int candy(int[] ratings) {
        int count = ratings.length;
        if (ratings.length==1) return 1;
        for (int i = 1; i < ratings.length-1; i++) {
            int diff1= ratings[i]-ratings[i-1];
            int diff2= ratings[i]-ratings[i+1];
            if (diff1>0&&diff2>0) count+=2;
            if (diff1>0||diff2>0) count++;
        }
        if (ratings[0]-ratings[1]>0) count++;
        if (ratings[ratings.length-1]-ratings[ratings.length-2]>0) count++;
        return count;
    }

}
