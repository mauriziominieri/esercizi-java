package esercizio1;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class FilteredSet<T> {
    private Set<T> set;
    public Predicate<T> predicate;

    public FilteredSet(Predicate<T> predicate) {
        this.set = new HashSet<>();
        this.predicate = predicate;
    }

    public boolean add(T t) {
        if (predicate.test(t))
            return set.add(t);
        return false;
    }

    public boolean contains(T t) {
        return set.contains(t);
    }

    public boolean remove(T t) {
        return set.remove(t);
    }

    public FilteredSet<T> intersect(FilteredSet<T> other) {
//        Predicate<T> intersectedPredicate = new Predicate<T>() {
//            @Override
//            public boolean test(T t) {
//                return predicate.test(t) && other.predicate.test(t);
//            }
//        };
        Predicate<T> intersectedPredicate = t -> predicate.test(t) && other.predicate.test(t);
        FilteredSet<T> intersectedSet = new FilteredSet<>(intersectedPredicate);
        for (T t : set) {
            if (other.set.contains(t))
                intersectedSet.set.add(t);
        }
        return intersectedSet;
    }
}
