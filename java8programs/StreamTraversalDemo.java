package java8programs;

import java.util.stream.Stream;

public class StreamTraversalDemo {

    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("Madhava", "Swapna", "Manas", "Hemanth");
        namesStream.forEach(System.out::println);
        namesStream.forEach(System.out::println);
    }

}
