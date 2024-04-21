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

public class Storage<T> {
    private Map<T, Integer> map;
    private T mostCommon;
    private int max;

    public Storage() {
        map = new HashMap<>();
    }

    public void put(T t, int n) {
        int newQuantity = map.getOrDefault(t, 0) + n;
        map.put(t, newQuantity);
        if (newQuantity > max) {
            max = newQuantity;
            mostCommon = t;
        }
    }

    public void take(T t) {
        if (map.get(t) == null)
            throw new IllegalArgumentException(t + " does not exist");
        int quantity = map.get(t);
        if (quantity == 1)
            map.remove(t);
        else
            map.put(t, quantity - 1);
        if (mostCommon == t)
            max = quantity - 1;
        for (Map.Entry<T, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                mostCommon = entry.getKey();
            }
        }
    }

    public T mostCommon() {
        if (map.isEmpty())
            throw new IllegalStateException("Empty storage");
        return mostCommon;
    }
}
