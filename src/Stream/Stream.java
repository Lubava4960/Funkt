package Stream;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;


public class Stream {
    public static <T> void findMinMax(
            java.util.stream.Stream<Integer> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> items = stream.sorted(order).collect(Collectors.toList());
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }



    public static void main(String[] args) throws Exception {
        java.util.stream.Stream<Integer> stream = new ArrayList<>(Arrays.asList(5, 8, 3, 4, 9, 13, 55)).stream();

        findMinMax(
                stream,
                (x, y) -> x.compareTo(y),
                (x, y) -> System.out.println(String.format("min: %s, max: %s", x, y))
        );

        stream.close();
    }

        public static void main(String[] args) {
            final int i = 0;


            java.util.stream.Stream<Integer> IntegerStream = java.util.stream.Stream.iterate(0, i -> ++i);


            IntegerStream
                    .limit(15)
                    .filter(( i -> i % 2 == 0))
                            .skip(10)

                            .forEach(System.out::println);

        }
}

