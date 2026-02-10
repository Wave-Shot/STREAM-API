import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,8);
        Optional<Integer> firstEven = list.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println(firstEven.get());
    }
}
