package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblemDemo {

    public static void main(String[] args) {
        int[] input = {2, 5, 7, 11, 13, 15, 6, 0};
        int target = 9;
        int[] result = twoSum(input, target);
        System.out.println(result[0]);
        System.out.println(result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[0];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            } else {
                result = new int[]{map.get(complement), i};
            }
        }
        return result;
    }
}
