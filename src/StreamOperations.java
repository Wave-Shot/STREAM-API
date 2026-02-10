import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,7);
        boolean allEven = list.stream().allMatch(n -> n % 2 == 0);
        boolean anyEven = list.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("All Even: " + allEven);
        System.out.println("Any Even: " + anyEven);
    }
}
