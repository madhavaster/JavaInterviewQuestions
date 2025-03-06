package java8programs;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordToUppercase {

    public static void main(String[] args) {
        String name = "madhava reddy penthali";
        String result = convertToUppercase(name);
        System.out.println(result);
    }

    private static String convertToUppercase(String name) {
        Stream<String> stream = Arrays.stream(name.split(" "));
        String collect = stream.map(s -> s.substring(0, 1).toUpperCase().concat(s.substring(1)))
                .collect(Collectors.joining(" "));
        return collect;
    }
}
