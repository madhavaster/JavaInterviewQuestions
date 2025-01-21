package java8programs;

import java.util.List;

public class Utils {
    public static List<Course> courseList() {
        return List.of(
                new Course("Spring", "Framework", 12000, 300, 20000),
                new Course("Spring Boot", "Framework", 15000, 1000, 25000),
                new Course("Microservices", "Microservices", 18000, 1200, 25000),
                new Course("Mongo", "Database", 10000, 400, 15000),
                new Course("MySQL", "Database", 10000, 400, 15000),
                new Course("Docker", "DevOps", 10000, 600, 15000),
                new Course("Kubernets", "DevOps", 10000, 600, 15000)
        );
    }
}