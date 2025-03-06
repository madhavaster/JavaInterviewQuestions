package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamsNullPointerCheckDemo {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Hyderabad", null, "Chennai", null, null, "Kolkatha", "Bangalore", "Pune", null, "Mumbai", "Delhi");
        List<String> validCities = removeNulls(cities);
        System.out.println(validCities);
    }

    private static List<String> removeNulls(List<String> inputList) {
        return inputList.stream()
                .filter(Objects::nonNull)
                .toList();
    }
}
