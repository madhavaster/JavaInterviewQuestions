package java8programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        //output = {5,4,3,2,1}
        revereArray(input);
        System.out.println(Arrays.toString(input));
    }

    public static void revereArray(int[] input) {
        int len = input.length;
        IntStream.rangeClosed(0, len / 2)
                .forEach(value -> {
                    int temp = input[value];
                    input[value] = input[len - 1 - value];
                    input[len - 1 - value] = temp;
                });
    }
}
