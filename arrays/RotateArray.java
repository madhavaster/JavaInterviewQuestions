package arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        m1(arr, 0, arr.length - 1);
        m1(arr, 0, 2);
        m1(arr,3,6);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] m1(int[] arr, int i, int j) {
        for (int elem : arr) {
            if (i < j) {
                arr[i] = arr[j];
                arr[j] = elem;
                i++;
                j--;
            }
        }
        return arr;
    }
}
