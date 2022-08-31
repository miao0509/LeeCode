package white.Learn.practices;

import java.util.Scanner;

/*
编号为0到n-1的n个人围成一圈。从编号为0的人开始报数1，依次下去，报到m的人离开，问最后留下的一个人，编号是多少？


 */
public class yuesefuhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int m = sc.nextInt();
        System.out.println(process(nums, m, n, 0));
    }

    public static int process(int[] nums, int m, int count, int start) {
        if (count == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != -1) return i ;
            }
        }
        int i = start % nums.length;
        for (int c = 0; c < m - 1; i = (i + 1) % nums.length) {
            if (nums[i] != -1)
                c++;
        }
        while (nums[i % nums.length] == -1){
            i++;
        }
        nums[i % nums.length] = -1;
        return process(nums, m, --count, (i + 1)%nums.length);
    }
}
