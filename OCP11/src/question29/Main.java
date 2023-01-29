package question29;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment on line 1 makes the m map contain the employee with the highest salary for each neighborhood?
    .collect(Collectors.groupingBy(Employee::getNeighborhood,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
 */
class Employee {
    private String name;
    private String neighborhood;
    private LocalDate birthday;
    private int salary;
    public Employee(String name, String neighborhood, int salary) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> roster = new ArrayList<>();
        roster.add(new Employee("Maurizio","San Ferdinando",10));
        roster.add(new Employee("Luca","Monte Calvario",3));
        roster.add(new Employee("Antonio","Vicaria",7));
        roster.add(new Employee("Alessandro","Vicaria",9));
        roster.add(new Employee("Mario","San Ferdinando",1));
        Map<String, Optional<Employee>> m = roster.stream().collect(Collectors.groupingBy(Employee::getNeighborhood,Collectors.maxBy(Comparator.comparing(Employee::getSalary)))); // Line 1
        System.out.println(m);
    }
}