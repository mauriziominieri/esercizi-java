package esercizio1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class WeightedSet<T> {
    private Map<Integer, Set<T>> map;
    private int weight;
    private Set<WeightedSet<T>> set;

    public WeightedSet() {
        map = new TreeMap<>(); // ordinata in base alla chiave
        set = new HashSet<>();
    }

    public void add(T t, int weight) {
        if (weight < this.weight)
            throw new IllegalArgumentException("Weight must be at least " + this.weight);
        map.computeIfAbsent(weight, k -> new HashSet<>()).add(t);
        for (WeightedSet<T> w : set)
            if (weight >= w.weight)
                w.map.computeIfAbsent(weight, k -> new HashSet<>()).add(t);
    }

    public WeightedSet<T> atLeast(int p) {
        WeightedSet<T> weightedSet = new WeightedSet<>();
        weightedSet.weight = p;
        set.add(weightedSet);
        map.forEach((key, value) -> {
            if (key >= p)
                weightedSet.map.put(key, value);
        });
        return weightedSet;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        map.values().forEach(items -> items.forEach(item -> sj.add(item.toString())));
        return sj.toString();
    }
}
