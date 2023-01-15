package esercizio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Accumulator<T extends Number> {

    private final List<T> positiveList;

    private final List<T> negativeList;

    private double sum;

    public Accumulator() {
        positiveList = new ArrayList<>();
        negativeList = new ArrayList<>();
    }

    public void add(T t) {
        if(t.doubleValue() > 0)
            positiveList.add(t);
        else
            negativeList.add(t);
        sum += t.doubleValue();
    }

    public Iterable<T> positives() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return positiveList.iterator();
            }
        };
    }

    public Iterable<T> negatives() {
        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {
                return negativeList.iterator();
            }
        };
    }

    public double sum() {
        return sum;
    }
}
