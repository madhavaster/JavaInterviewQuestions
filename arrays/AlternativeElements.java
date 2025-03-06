package arrays;

import java.util.List;
import java.util.stream.IntStream;

public class AlternativeElements {
    public static void main(String[] args) {
        List<Integer> input = List.of(10, 5, 4, 9, 3, 23, 54, 22, 90);
        m1(input);
    }

    public static void m1(List<Integer> input) {
        IntStream.range(0, input.size())
                .filter(i -> i % 2 == 0)
                .forEach(value -> System.out.println(input.get(value)));
    }
}
