package esercizio1;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

// T deve essere un oggetto comparabile, cioè dotato di un ordinamento (i numeri hanno ordine, le stringhe hanno ordine lessicografico, ecc)
// utilizzerò quindi il metodo compareTo per i confronti: a.compareTo(b) > 0 -> a maggiore di b, < 0 -> a < b, == 0 -> a == b
public class Range<T extends Comparable<T>> {

    private final T minimo;

    private final T massimo;

    public Range(T minimo, T massimo) {
        if(minimo.compareTo(massimo) > 0)
            throw new RuntimeException(minimo + " deve essere minore di " + massimo);
        this.minimo = minimo;
        this.massimo = massimo;
    }

    public boolean isInside(T x) {
        return x.compareTo(minimo) >= 0 && x.compareTo(massimo) <= 0;
    }

    public boolean isOverlapping(Range<T> range) {
        return range.minimo.compareTo(minimo) >= 0 && range.minimo.compareTo(massimo) <= 0
            || minimo.compareTo(range.minimo) >= 0 && massimo.compareTo(range.massimo) <= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Range<?> range = (Range<?>) o;
        return Objects.equals(minimo, range.minimo) && Objects.equals(massimo, range.massimo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimo, massimo);
    }
}
