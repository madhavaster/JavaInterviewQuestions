package java8programs;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        createTuples();
//        m1();
//        textBlocks();
//        Stream<Course> stream1 = Utils.courseList().stream();
//        int[] arr = {};
//        IntStream stream = Arrays.stream(arr);
//        System.out.println(stream.sum());
        //        Comparator<Course> comparingByCourseName = Comparator.comparing(Course::courseName);
//        Comparator<Course> comparingByCourseReview = Comparator.comparing(Course::courseReviews);
//        Comparator<Course> comparyingByNoOfStudents = Comparator.comparing(Course::noOfStudents);
//        Comparator<Course> comparingByCourseFee = Comparator.comparing(Course::courseFee);
//
//        Map<String, Long> collect = Utils.courseList().stream()
//                .collect(Collectors.groupingBy(Course::courseCategory, Collectors.counting()));
//
//        collect.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    private static void textBlocks() {
        var msg = """
                Know your Java's! with "doublequotes"
                """;
        System.out.println(msg);
    }

    private static void m1() {
//        var names = List.of("madhava", "manas");
        List<List<String>> list = Arrays.asList(
                List.of("ONE", "ONE"),
                List.of("ONE", "TWO"),
                List.of("ONE", "THREE"),
                List.of("TWO", "TWO"),
                List.of("TWO", "THREE"),
                List.of("THREE", "THREE")
        );

        List<List<String>> list1 = list.stream().filter(strings -> strings.get(0).length() == strings.get(1).length())
                .toList();
        System.out.println(list1);
    }

    public static void createTuples() {
        List<Integer> list1 = Arrays.asList(0, 1);
        List<Integer> list2 = Arrays.asList(0, 1);
        List<List<Integer>> list3 = list1.stream()
                .flatMap(e1 -> list2.stream().map(e2 -> List.of(e1, e2)))
                .toList();

        List<Integer> list4 = Arrays.asList(0, 1);
        List<Integer> list = list4.stream()
                .flatMap(e4 -> list3.stream().flatMap(e5 -> e5.stream()))
                .toList();
        System.out.println(list);
    }
}
