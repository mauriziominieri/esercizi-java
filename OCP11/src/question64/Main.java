package question64;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
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
Which code fragment, when inserted on line 1, gives the number of employees who where born after January 1, 1989 and have a salary greater than 25?
    long youngAndRich = .filter(p).filter(e -> e.getBirthday().isAfter(d)).count();
 */
class Employee {
    private String name;
    private LocalDate birthday;
    private int salary;

    public Employee(String name, LocalDate birthday, int salary) {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
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
        Predicate<Employee> p = e -> e.getSalary() > 25;
        LocalDate d = IsoChronology.INSTANCE.date(1989, 1, 1);

        roster.add(new Employee("Maurizio", IsoChronology.INSTANCE.date(1994, 5, 28), 50));
        roster.add(new Employee("Luca", IsoChronology.INSTANCE.date(1989, 1, 2), 26));
        roster.add(new Employee("Giuseppe", IsoChronology.INSTANCE.date(1989, 1, 1), 1000));
        roster.add(new Employee("Mario", IsoChronology.INSTANCE.date(2000, 5, 28), 5));
        roster.add(new Employee("Antonio", IsoChronology.INSTANCE.date(1988, 5, 28), 150));

//        long youngAndRich1 = roster.stream().filter(p && e.getBirthday().isAfter(d)).count();
//        long youngAndRich2 = roster.stream().filter(p).collect(Collectors.partitioningBy(e -> e.getBirthday().isAfter(d))).get(true).count();
        long youngAndRich = roster.stream().filter(p).filter(e -> e.getBirthday().isAfter(d)).count();
//        long youngAndRich4 = roster.stream().collect(Collectors.partitioningBy(p)).get(true).count();

        System.out.println(youngAndRich);
    }
}