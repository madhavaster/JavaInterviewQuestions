package java8programs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Utils.employees();
        double salary = secondHighestSalary(employees);
        System.out.println(salary);
    }

    public static double secondHighestSalary(List<Employee> employees) {
        Optional<Employee> first = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        return first.get().getSalary();
    }
}
