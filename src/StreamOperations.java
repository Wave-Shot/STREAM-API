import java.util.*;
import java.util.stream.*;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30);

        Stream<Integer> stream = numbers.stream();
        stream.forEach(System.out::println);
    }
}
