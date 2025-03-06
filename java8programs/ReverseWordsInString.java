package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String line = "Welcome to Spring Boot and Micro Services";
        List<String> result = reversedString(line);
        System.out.println(result);
        String collect = result.stream()
                .collect(Collectors.joining());
        System.out.println(collect);
    }

    public static List<String> reversedString(String input) {
        String[] words = input.split(" ");
        Stream<String> stream = Arrays.stream(words);
        List<String> result = stream.map(word -> {
                    StringBuilder sb = new StringBuilder(word);
                    sb.reverse();
                    return sb.toString();
                })
                .toList();

        return result;
    }
}
