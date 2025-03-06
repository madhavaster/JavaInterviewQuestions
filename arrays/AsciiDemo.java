package arrays;

import java.util.stream.IntStream;

public class AsciiDemo {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(0, 100).toArray();
        for (int i : array) {
            char c = asciiValue(i);
            System.out.println(i + ":" + c);
        }
    }

    public static char asciiValue(int value) {
        return (char) value;
    }
}
