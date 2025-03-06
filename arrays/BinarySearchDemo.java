package arrays;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 7;
        int result = binarySearch(inputArray, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] inputArray, int target) {
        int left = 0;
        int right = inputArray.length - 1;
        while (left < right) {
            int mid = left + (right - right) / 2;
            if (inputArray[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return inputArray[left] == target ? left : -1;
    }
}
