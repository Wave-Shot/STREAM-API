import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,10);
        int min = list.stream().min(Integer::compare).get();
        int max = list.stream().max(Integer::compare).get();
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
