package esercizio1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class SelectorIterator<T> implements Iterable<T> {

    private final Collection<T> list;

    public SelectorIterator(Collection<T> list, Selector<T> selector) {
        this.list = new ArrayList<>();
        for(T t : list)
            if(selector.select(t))
                this.list.add(t);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
