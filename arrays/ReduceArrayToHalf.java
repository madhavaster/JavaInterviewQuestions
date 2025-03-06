package arrays;

import java.util.Arrays;

public class ReduceArrayToHalf {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = reduceArraySize(arr);
        System.out.println(result);
    }

    public static int reduceArraySize(int[] arr) {
        int target = arr.length / 2; // 5
        int max = Integer.MIN_VALUE;
        for (int e : arr) {
            max = Math.max(e, max);
        }
        int[] frequency = new int[max + 1];
        for (int e : arr) {
            frequency[e]++;
        }
        Arrays.sort(frequency);
        int result = 0;
        int count = 0;
        while (result <= target) {
            result = result + frequency[max];
            max--;
            count++;
        }
        return count;
    }
}