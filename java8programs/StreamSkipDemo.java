package java8programs;

import java.util.List;
import java.util.stream.Stream;

public class StreamSkipDemo {
    public static void main(String[] args) {
        Stream<Integer> inputStream = Stream.iterate(1, n -> n + 1);
        int number = 20;
        Stream<Integer> outputStream = limitElements(inputStream, number);
        List<Integer> list = outputStream.toList();
        System.out.println(list);
    }

    private static Stream<Integer> limitElements(Stream<Integer> inputStream, int number) {
        return inputStream.limit(number);
    }

}
