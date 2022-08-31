package white.Learn.practices;

import java.util.HashMap;
import java.util.Map;

/**
 * 插入删除都是O(1)
 * 里面的数字等概率分布
 */
public class RandomPool<K> {
    private Map<K,Integer> map1 ;
    private Map<Integer,K> map2;
    private int size;

    public  RandomPool(){
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        size = 0;
    }
    public void insert(K key){
        if (!map1.containsKey(key)){
            map1.put(key,size);
            map2.put(size,key);
            size++;
        }
    }
    public void delete(K key){
        if (map1.containsKey(key)){
            Integer index = map1.get(key);
            K last = map2.get(--size);
            map1.put(last,index);
            map2.put(index,last);
            map1.remove(last);
            map2.remove(index);

        }
    }
    public K getRandom(){
        if (size==0){
            return null;
        }
        int random = (int)(Math.random()*size);
        return map2.get(random);
    }

    public static void main(String[] args) {
        RandomPool randomPool = new RandomPool();
        randomPool.insert("a");
        randomPool.insert("b");
        randomPool.insert("b");
        randomPool.insert("c");
        String random = (String)randomPool.getRandom();
        System.out.println(random);
        randomPool.delete(random);

    }
}
