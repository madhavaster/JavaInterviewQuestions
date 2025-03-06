package java8programs;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxIntFromArray {
    public static void main(String[] args) {
        int[] numbers = {1,4,2,9,4,0,5,3,8};
        IntStream stream = Arrays.stream(numbers);
        OptionalInt max = stream.max();
        int asInt = max.getAsInt();
        System.out.println(asInt);
    }
}
