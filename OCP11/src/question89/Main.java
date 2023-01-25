package question89;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two Map objects group all employees with a salary greater than 30 by neighborhood?
    1. Map<Optional<String>, List<Employee>> r4 = roster.stream().collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList())));
    2. Map<String, List<Employee>> r1 = roster.stream().collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.filtering(p, Collectors.toList())));
 */
// Ricorda stream().collect e poi esclusi r5 date le parentesia finali e il ';' a casaccio
class Employee {
    private String name;
    private String neighborhood;
    private int salary;

    public Employee(String name, String neighborhood, int salary) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Employee> roster = new ArrayList<>();

        roster.add(new Employee("Maurizio", "Fuorigrotta", 50));
        roster.add(new Employee("Roberto", "Arenella", 10));
        roster.add(new Employee("Alberto", "Fuorigrotta", 34));
        roster.add(new Employee("Mario", "Barra", 5));
        roster.add(new Employee("Gilberto", "Barra", 45));

        Predicate<Employee> p = e -> e.getSalary() > 30;
        Function<Employee, Optional<String>> f = e -> Optional.ofNullable(e.getNeighborhood());
//        Map<Optional<String>, List<Employee>> r3 = roster.stream().filter(p).collect(Collectors.groupingBy(p));
//        Map<Optional<String>, List<Employee>> r5 = roster.stream().collect(Collectors.groupingBy(Employee::getNeighborhood,Collectors.filtering(p, Collectors.toList())));));
        Map<Optional<String>, List<Employee>> r4 = roster.stream().collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList()))); // OK
//        Map<String, List<Employee>> r2 = roster.stream().filter(p).collect(Collectors.groupingBy(f, Employee::getNeighborhood));
        Map<String, List<Employee>> r1 = roster.stream().collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.filtering(p, Collectors.toList()))); // OK
    }
}