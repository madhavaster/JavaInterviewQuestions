package java8programs;

import java.util.ArrayList;
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

    public static List<Employee> employees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Madhava Reddy", "IT", 30000D));
        employees.add(new Employee(2, "Swapna", "HR", 15000D));
        employees.add(new Employee(3, "Raghu", "CLOUD", 25000D));
        employees.add(new Employee(4, "Ravi", "SALES", 35000D));
        employees.add(new Employee(5, "Sanjeev", "SALES", 30000D));
        employees.add(new Employee(6, "Shravan", "IT", 28000D));
        employees.add(new Employee(7, "Praveen", "IT", 26000D));
        employees.add(new Employee(8, "Phani", "CLOUD", 45000D));
        return employees;
    }
}