package java8programs;

import java.util.Arrays;
import java.util.List;

public class CommonElementsIn2Arrays {
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {6, 7, 8};
        List<Integer> result = commonElements(input1, input2);
        System.out.println(result);
    }

    public static List<Integer> commonElements(int[] input1, int[] input2) {
        List<Integer> list = Arrays.stream(input1)
                .filter(value1 -> Arrays.stream(input2)
                        .anyMatch(value2 -> value2 == value1))
                .boxed()
                .toList();
        return list;
    }
}

/**
 * step 1: convert the int[] to IntStreams as we have to use java 8 style of programming
 * step 2: for each value of first IntStream, check/filter if this value exists
 * in the second IntStream or not.
 * step 3: now box the data to its corresponding Wrapper object
 */