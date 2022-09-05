package white.jingdong;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: ldx
 * @Description:
 * @Date: 2022-09-03 15:15
 */
public class qiu2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] nums = new int[num];
        int max = 0;
        for(int i = 0; i < num; i++) {
            nums[i] = scanner.nextInt();
            max = Math.max(max, nums[i]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 1);
        map.put(3, 2);
        map.put(4, 3);
        map.put(5, 4);
        for(int i = 6; i <= max; i++) {
            int temp = map.get(i - 1) + 1;
            for(int j = 2; j <= Math.sqrt(i); j++) {
                if((i % j) == 0) {
                    temp = Math.min(temp, map.get(i / j) + map.get(j) + 1);
                }
            }
            map.put(i, temp);
        }
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            count = count + map.get(nums[i]);
        }
        System.out.println(count);
    }
}
