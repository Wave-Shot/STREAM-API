import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
