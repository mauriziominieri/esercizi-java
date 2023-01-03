package esercizio1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Progression {

    private final int salary;

    private final int increment;

    private final Map<String, Employee> employeeMap;  // name, employee

    public Progression(int salary, int increment) {
        this.salary = salary;
        this.increment = increment;
        employeeMap = new HashMap<>();
    }

    public void addEmployee(String name, int year) {
        employeeMap.put(name, new Employee(name, year));
    }

    public int getSalary(String name, int year) {
        Employee employee = employeeMap.get(name);
        int bonus = employee.getBonusMap().get(year) == null ? 0 : employee.getBonusMap().get(year);
        int years = year - employee.year;
        return this.salary + increment * years + bonus;
    }

    public void addBonus(String name, int year, int bonus) {
        Employee employee = employeeMap.get(name);
        employee.setBonusMap(year, bonus);
    }
}
