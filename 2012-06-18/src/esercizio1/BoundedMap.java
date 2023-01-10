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

public class BoundedMap<T1, T2> {

    private final int dimension;

    private final Map<T1, T2> map;  // contiene la chiave & il valore

    private final Map<T1, Integer> map2;    // contiene la chiave & il numero delle volte che è stata cercata

    public BoundedMap(int dimension) {
        this.dimension = dimension;
        map = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void put(T1 t1, T2 t2) {
        if(map.size() == dimension) {
            int min = Integer.MAX_VALUE;
            T1 keyToRemove = null;
            for(T1 t : map2.keySet()) {
                if(map2.get(t) != null && map2.get(t) < min) {
                    min = map2.get(t);
                    keyToRemove = t;
                }
            }
            map.remove(keyToRemove);
            map2.remove(keyToRemove);
        }
        map.put(t1, t2);
        map2.put(t1, 0);
    }

    public T2 get(T1 t1) {
        if(map2.get(t1) != null)
            map2.put(t1, map2.get(t1) + 1);
        return map.get(t1);
    }
}
