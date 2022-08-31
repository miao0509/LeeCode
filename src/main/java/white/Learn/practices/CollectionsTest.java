package white.Learn.practices;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CollectionsTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4");
//        list.stream().map(Integer::parseInt).forEach(System.out::println);
        Optional<String> any = list.stream().findAny();
        System.out.println(any.get());


    }
}
