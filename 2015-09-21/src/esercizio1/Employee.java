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

public class Employee {

    private String name;

    int year;   // package-private per comodità

    private final Map<Integer, Integer> bonusMap;  // year, bonus

    public Employee(String name, int year) {
        this.name = name;
        this.year = year;
        bonusMap = new HashMap<>();
    }

    public Map<Integer, Integer> getBonusMap() {
        return bonusMap;
    }

    public void setBonusMap(int year, int bonus) {
        this.bonusMap.put(year, bonus);
    }
}
