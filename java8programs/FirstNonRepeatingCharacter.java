package java8programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String name = "aabbcc";
        Stream<Character> characterStream = name.chars().mapToObj(value -> (char) value);
        Map<Character, Long> collect = characterStream.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        Character first = collect.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst().orElseThrow(() -> new RuntimeException("No Non Repeating character"));
        System.out.println(first);
    }
}
