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

public class Relation<S, T> {
    private Map<S, Set<T>> map;
    private Map<T, Set<S>> inverseMap;

    public Relation() {
        map = new HashMap<>();
        inverseMap = new HashMap<>();
    }

    public void put(S s, T t) {
        map.computeIfAbsent(s, k -> new HashSet<>()).add(t);
        inverseMap.computeIfAbsent(t, k -> new HashSet<>()).add(s);
    }

    public Relation<T, S> inverse() {
        Relation<T, S> relation = new Relation<>();
        relation.map = inverseMap;
        relation.inverseMap = map;
        return relation;
    }

    public boolean isFunctional() {
        for (Set<T> set : map.values())
            if (set.size() > 1)
                return false;
        return true;
    }
}
