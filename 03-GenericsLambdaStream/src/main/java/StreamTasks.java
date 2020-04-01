import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTasks {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);

        list.stream()
                .map(a -> a * 10)     // inter operation
                .filter(b -> b > 10)  // inter operation
                .forEach(c -> System.out.println(c)); // terminal operation

        System.out.println("====");

        int sum  = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        System.out.println("====");

        long count = Stream.of(3, 0, 5).count();
        System.out.println(count);

        System.out.println("====");

        Stream.of(3, 0, 5).sorted().forEach(a -> System.out.println(a));

        System.out.println("====");

        Stream.of(3, 0, 5, 45, 23).limit(2).forEach(a -> System.out.println(a));

        System.out.println("====");

        System.out.println(
                Stream.of("aa", "aa", "ab", "cc")
                        .distinct() // aa ab
                        .filter(a -> a.startsWith("a")) // aa ab
                        .map(b -> b + "c")  // aac abc
                        .collect(Collectors.toList())
        );


//        animal.getChilds().stream().filter(a -> a.hasAge()).map().findfirst()

        System.out.println("====");

        List<Integer> numbers = Arrays.asList(1, 7, 3, 3, 3, 4, 5, 6, 2, 1);

        // todo find all even numbers bigger than 3 and smaller than 7

        Object[] array = numbers.stream().filter(a -> a%2 == 0).filter(b -> b > 3 && b < 7).sorted().toArray();

        System.out.println(Arrays.toString(array));

    }
}
