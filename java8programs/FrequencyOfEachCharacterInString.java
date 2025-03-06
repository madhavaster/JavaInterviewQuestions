package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {
        String name = "madhava reddy penthali";
        frequencyOfEachCharacter(name);
        IntStream chars = name.chars();
        Stream<Character> collect = chars.mapToObj(value -> (char) value);
        Map<Character, Long> collect1 = collect.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);

    }

    public static void frequencyOfEachCharacter(String input) {
        String[] split = input.split("");
        Stream<String> stream = Arrays.stream(split);
        Map<String, Long> collect = stream.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(collect);
    }
}
