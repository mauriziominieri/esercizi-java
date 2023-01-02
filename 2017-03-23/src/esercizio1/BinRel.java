package esercizio1;

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

public class BinRel<T> {

    private final Map<T, Set<T>> map;

    public BinRel() {
        map = new HashMap<>();
    }

    public void addPair(T a, T b) {
        Set<T> set = map.get(a) == null ? new HashSet<>() : map.get(a);
        set.add(b);
        map.put(a, set);
    }

    public boolean isSymmetric() {
        for(T key : map.keySet())
            for(T value : map.get(key))
                if(map.get(value) == null || !map.get(value).contains(key))
                    return false;
        return true;
    }

    public boolean areRelated(T a, T b) {
        return map.get(a).contains(b);
    }
}
