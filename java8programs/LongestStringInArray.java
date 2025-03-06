package java8programs;

import java.util.Arrays;

public class LongestStringInArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Avacado", "Pineapple", "Kiwi"};
//        String[] fruits = {};
        int i = longestFruit(fruits);
        System.out.println(i);
    }

    public static int longestFruit(String[] fruits) {
        int i = Arrays.stream(fruits).mapToInt(String::length).max().orElse(0);
        return i;
    }
}
