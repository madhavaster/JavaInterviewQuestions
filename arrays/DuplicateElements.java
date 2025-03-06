package arrays;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
    public static void main(String[] args) {
//        m1();
        m2();
    }

    private static void m2() {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
        Map<Integer, Integer> hm = new HashMap<>();
        for (Integer number : numbers) {
            if (hm.containsKey(number)) {
                hm.put(number, hm.get(number) + 1);
            } else {
                hm.put(number, 1);
            }
        }
        hm.forEach((k, v) -> {
            System.out.println(k + "::" + v);
        });
    }

    private static void m1() {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[i]);
                }
            }
        }
    }
}
// 0 -> 1,2,3,4,5,6,7
// 1 -> 2,3,4,5,6,7
// 2 -> 3,4,5,6,7
// 3 -> 4,5,6,7
// 4 -> 5,6,7
// 5 -> 6,7
// 6 -> 7