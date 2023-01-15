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

public class Inventory<T> {

    private final Map<T, Integer> map;

    private T mostCommon;

    private int max;

    public Inventory() {
        map = new HashMap<>();
    }

    public void add(T t) {
        map.put(t, map.get(t) == null ? 1 : map.get(t) + 1);
        if(map.get(t) > max) {
            max = map.get(t);
            mostCommon = t;
        }
    }

    public int count(T t) {
        return map.get(t) == null ? 0 : map.get(t);
    }

    public T getMostCommon() {
        return mostCommon;
    }
}
