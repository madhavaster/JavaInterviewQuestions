package java8programs;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Utils.employees();
        DoubleStream doubleStream = employees.stream()
                .mapToDouble(Employee::getSalary);
        OptionalDouble average = doubleStream.average();
        double asDouble = average.getAsDouble();
        System.out.println(asDouble);

        Double collect = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(collect);
    }
}
