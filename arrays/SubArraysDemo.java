package arrays;

import java.util.Arrays;

public class SubArraysDemo {
    public static void main(String[] args) {
        int[] input = {1, 2};

        for (int i = 0; i < input.length; i++) {
            for (int j = i; j < input.length; j++) {
                int[] result = new int[j - i + 1];
                for (int k = i, l = 0; k <= j; l++, k++) {
                    result[l] = input[k];
                }
                String string = Arrays.toString(result);
                System.out.println(string);
            }
        }
    }
}
