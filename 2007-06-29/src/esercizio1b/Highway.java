package esercizio1b;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Highway {

    private int length;

    private final Map<Integer, Integer> map;  // km, nCars

    public Highway(int length) {
        this.length = length;
        map = new HashMap<>();
    }

    public void insertCar(int x) {
        map.put(x, map.get(x) == null ? 1 : map.get(x) + 1);
    }

    public int nCars(int x) {
        return map.get(x) == null ? 0 : map.get(x);
    }

    public void progress() {
        Set<Integer> set = new HashSet<>(map.keySet()); // se non usassi questo set copia avrei una ConcurrentModificationException
        for (Integer key : set) {
            map.put(key + 1, map.get(key) == null ? 0 : map.get(key));
            map.put(key, 0);
        }
    }
}
