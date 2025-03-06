package java8programs;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class HighestSalaryEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Utils.employees();
        double result = highestSalary(employees);
        System.out.println(result);
        highestSalaryDept(employees);
    }

    public static void highestSalaryDept(List<Employee> employees) {
        Map<String, DoubleSummaryStatistics> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, LinkedHashMap::new, Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println(collect);
    }

    public static double highestSalary(List<Employee> employees) {
        DoubleStream doubleStream = employees.stream()
                .mapToDouble(value -> value.getSalary());
        OptionalDouble max = doubleStream.max();
        return max.getAsDouble();
    }
}
