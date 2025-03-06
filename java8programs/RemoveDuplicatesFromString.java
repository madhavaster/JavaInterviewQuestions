package java8programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String name = "Madhava Reddy Penthali";
        String result = removeDuplicates(name);
        System.out.println(result);
    }

    private static String removeDuplicates(String name) {
        String[] split = name.split("");
        Stream<String> stream = Arrays.stream(split);
        String collect = stream.distinct()
                .collect(Collectors.joining());
        return collect;
    }
}
