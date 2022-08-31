package white.problems.medium;

import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        int[] ints = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        // 根据map的value值正序排，相当于一个小顶堆
//         PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        /*
        在PriorityQueue类的offer(插入方法中)的
         //siftUp()
        private void siftUp(int k, E x) {
            while (k > 0) {
                int parent = (k - 1) >>> 1;//parentNo = (nodeNo-1)/2
                Object e = queue[parent];
                     方法中 o1>o2 就交换  否则不变
                if (comparator.compare(x, (E) e) >= 0)//调用比较器的比较方法
                    break;
                queue[k] = e;
                k = parent;
            }
            queue[k] = x;

         */
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a,b) -> a.getValue().equals(b.getValue()) ? b.getKey().compareTo(a.getKey()) : a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> entry : entries) {
            queue.offer(entry);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll().getKey();
        }
        return result;
    }
}
