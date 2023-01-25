package question65;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment inserted on line 11 prints the average salary of all employees from the Bay Area?
    .filter(e -> e.getLocality().equals("Bay Area")).mapToInt(Employee::getSalary).average().getAsDouble();
 */
// Ricorda che il metodo average è del mapToInt() o mapToDouble() e DEVE ESSERCI il metodo .getAsDouble() o .orElse(0.0)
class Employee {
    private String locality;
    private int salary;

    public Employee(String locality, int salary) {
        this.locality = locality;
        this.salary = salary;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
public class Main {
    static List createEmployeeList() {
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Bay Area", 2));
        employeeList.add(new Employee("Bay Green", 45));
        employeeList.add(new Employee("Bay Green", 100));
        employeeList.add(new Employee("Bay Area", 2));
        employeeList.add(new Employee("Bay Green", 20));
        employeeList.add(new Employee("Bay Red", 4));
        employeeList.add(new Employee("Bay Area", 3));
        return employeeList;
    }
    public static void main(String[] args) {
        List<Employee> roster = createEmployeeList();
        double average = roster.stream()
        /* insert code here */
        .filter(e -> e.getLocality().equals("Bay Area")).mapToInt(Employee::getSalary).average().getAsDouble();
//        .filter(e -> e.getLocality().equals("Bay Area")).average(Employee::getSalary).getAsDouble();
//        .collect(Collectors.groupingBy(Employee::getLocality, Collectors.averagingDouble(Employee::getSalary)));
//        .filter(e -> e.getLocality().equals("Bay Area")).filter(s -> s.getSalary()).average().getAsDouble();
        System.out.println(average);
    }
}