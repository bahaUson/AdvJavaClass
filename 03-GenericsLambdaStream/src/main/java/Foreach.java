import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Foreach {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);

        for (Integer item: list) {
            System.out.println(item);
        }

        // interface
        Consumer<? super Integer> action = new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        list.forEach(action);

        // lambda
        Consumer<? super Integer> action1 = (Integer n) -> System.out.println(n);
        list.forEach(action1);

        list.forEach(n -> System.out.println(n));

//        [1, 5, 10] -> 1 -> printing
//                   -> 5 -> printing
//                   -> 10 -> printing


        Map<String, String> map = new HashMap<>();
        map.put("Java", "cool");
        map.put("Kotlin", "best");

        // print Java is cool

        BiConsumer<String, String> biConsumer = (String k, String v) -> System.out.println(k + " is " + v);
        map.forEach(biConsumer);

        map.forEach((k, v) -> System.out.println(k + " is " + v));
    }
}
