package java8programs;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5,9};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] resultArray = concatArrays(arr1, arr2);
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] concatArrays(int[] arr1, int[] arr2) {
        return IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();
    }
}
