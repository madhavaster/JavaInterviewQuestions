package arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {8, 7, 6, 34, 9};
        int len = input.length;
        for (int k = 0; k < len; k++) {
            for (int i = 0; i < len - 1; i++) {
                int elem1 = input[i];
                int elem2 = input[i + 1];
                if (elem1 > elem2) {
                    int temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
