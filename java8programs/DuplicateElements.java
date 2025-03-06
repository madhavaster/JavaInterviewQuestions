package java8programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 5, 4, 4, 6, 7, 7, 7, 8);
        List<Integer> duplicates = duplicateElements(numbers);
        System.out.println(duplicates);
        /* using Set */
        Set<Integer> duplicates1 = duplicateElementsUsingSet(numbers);
        System.out.println(duplicates1);
    }

    private static Set<Integer> duplicateElementsUsingSet(List<Integer> numbers) {
        Set<Integer> numberSet = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(number -> !numberSet.add(number))
                .collect(Collectors.toSet());
        return duplicates;
    }

    private static List<Integer> duplicateElements(List<Integer> numbers) {
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequencyMap);
        List<Integer> duplicateElements = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        return duplicateElements;
    }
}
