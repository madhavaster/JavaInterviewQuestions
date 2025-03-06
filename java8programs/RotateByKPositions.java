package java8programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RotateByKPositions {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        k = k % input.length;
        // output: {7,1,2,3,4,5,6}
        int[] result = rotateByKPositions(input, k);
        String string = Arrays.toString(result);
        System.out.println(string);
    }

    private static int[] rotateByKPositions(int[] input, int k) {
        int len = input.length;
        return IntStream.concat(Arrays.stream(input, len - k, len), Arrays.stream(input, 0, len - k)).toArray();
    }
}

