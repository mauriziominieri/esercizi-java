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

// specifico che T (il tipo generico) deve essere sottoclasse di Object e deve implementare l'interfaccia Comparable (per poter fare i confronti)
public class SortedList<T extends Object & Comparable<T>> implements Iterable<T> {

    private final List<T> list;

    public SortedList() {
        list = new ArrayList<>();
    }

    public void add(T t) {
        for (int i = 0; i < list.size(); i++) {
            if (t.compareTo(list.get(i)) <= 0) {    // se l'elemento è minore o uguale allora lo inserisco in posizione i e sposto i restanti
                list.add(i, t);
                return;
            }
        }
        list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
