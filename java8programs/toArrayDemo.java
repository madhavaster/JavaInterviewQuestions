package java8programs;

import java.util.Arrays;
import java.util.List;

public class toArrayDemo {
    public static void main(String[] args) {
        List<String> fruits = List.of("Banana", "Apple", "Cherry", "Watermelon");
        // List<String> to String[]
        String[] array = fruits.toArray(String[]::new);
        String string = Arrays.toString(array);
        System.out.println(string);
    }
}
