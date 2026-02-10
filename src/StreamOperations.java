import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,5,2,8,1,3);
        List<Integer> sorted = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sorted);
    }
}
