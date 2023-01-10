package esercizio1b;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Bijection<T1, T2> {

    private Map<T1, T2> keyMap;

    private Map<T2, T1> valueMap;

    public Bijection() {
        keyMap = new HashMap<>();
        valueMap = new HashMap<>();
    }

    public void addPair(T1 t1, T2 t2) {
        if(keyMap.get(t1) != null)
            throw new RuntimeException("La chiave " + t1 + " è già presente");
        if(valueMap.get(t2) != null)
            throw new RuntimeException("Il valore " + t2 + " è già presente");
        keyMap.put(t1, t2);
        valueMap.put(t2, t1);
    }

    public T2 getValue(T1 t1) {
        return keyMap.get(t1);
    }

    public T1 getKey(T2 t2) {
        return valueMap.get(t2);
    }
}
