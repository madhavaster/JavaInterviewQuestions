package java8programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        Stream<String> name = Stream.of("Madhava", "Reddy", "Penthali");
        Stream<String> characterStream = wordLetters(name);
        characterStream.forEach(System.out::println);

        String[] names = {"Madhava", "Swapna", "Manas", "Hemanth"};
        // convert String[] to stream
        Stream<String> namesStream = Arrays.stream(names);
        // map to uppercase
        namesStream.map(String::toUpperCase).forEach(System.out::println);

        // flatMap example
        // create 4 student objects
        Student s1 = new Student(1, "Madhava Reddy Penthali", List.of("8886022722", "8639700973"));
        Student s2 = new Student(2, "Swapna", List.of("8886022422", "8639700987"));
        Student s3 = new Student(3, "Hemanth", List.of("8612341234", "8245892345"));
        Student s4 = new Student(4, "Manas", List.of("01900913451", "98124375945"));
        List<Student> studentList = List.of(s1, s2, s3, s4);
        List<String> phoneNumbers = studentList.stream()
                .flatMap(student -> student.getPhoneNumbers().stream())
                .toList();
        System.out.println(phoneNumbers);
    }

    private static Stream<String> wordLetters(Stream<String> inputStream) {
        Stream<String[]> stream = inputStream.map(word -> word.split(""));
        Stream<String> stringStream = stream.flatMap(strings -> Arrays.stream(strings));
        return stringStream;
    }
}

class Student {
    private int id;
    private String name;
    private List<String> phoneNumbers;

    public Student(int id, String name, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }
}
