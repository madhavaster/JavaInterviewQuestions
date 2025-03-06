package java8programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondSmallestElementInArray {
    public static void main(String[] args) {
        int[] input = {2, 1, 1, 3, 5, 8};
        int result = getSecondSmallestElement(input);
        System.out.println(result);
        int result1 = secondHighestNumber(input);
        System.out.println(result1);
    }

    public static int getSecondSmallestElement(int[] input) {
        return Arrays.stream(input).sorted().skip(1).findFirst().orElseThrow(() -> new IllegalArgumentException("Array doesnt have a second smallest element"));
    }

    public static int secondHighestNumber(int[] input) {
        IntStream stream = Arrays.stream(input);
        Stream<Integer> boxed = stream.boxed();
        Stream<Integer> sorted = boxed.sorted(Comparator.reverseOrder());
        Stream<Integer> skip = sorted.skip(1);
        Optional<Integer> optionalInteger = skip.findFirst();
        Integer i = optionalInteger.orElse(0);
        return i;
    }
}
