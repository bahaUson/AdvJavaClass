import java.util.function.Function;

public class Lambda {

    public static void main(String[] args) {

        // reference variable = anonymous object
        Function<String, String> function1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s + s;
            }
        };

        Function<String, String> function2 = (String s) -> s + s;

        print(function1);
        print(function2);
        print(a -> a + a);
    }

    public static void print(Function<String, String> function) {
        System.out.println(function.apply("Hi"));
    }
}

