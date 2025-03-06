package java8programs;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitDemo {
    public static void main(String[] args) {
        List<Integer> integers = generateRandomNumbers(10);
        System.out.println(integers);
    }

    private static List<Integer> generateRandomNumbers(int limit) {
        return Stream.generate(new Random()::nextInt).limit(limit).toList();
    }
}
