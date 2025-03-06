package arrays;

public class MountainProblem {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 8, 6, 4, 2, 0};
//        int index = mountainIndex(arr);
//        int index = mountainIndex1(arr);
        int index = mountainIndex2(arr);
        System.out.println(index);
    }

    public static int mountainIndex2(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public static int mountainIndex1(int[] arr) {
        int i = 0;
        while (arr[i] < arr[i + 1]) {
            i++;
        }
        return i;
    }

    public static int mountainIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                return i;
            }
        }
        return -1;
    }
}
