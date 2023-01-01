package esercizio1b;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class SafeSet<T> {

    private final Set<T> set;

    private final Set<T> trash;

    public SafeSet() {
        set = new HashSet<>();
        trash = new HashSet<>();
    }

    // When a thread invokes a synchronized method, it automatically acquires the lock for that object and releases it when the thread completes its task
    public synchronized boolean add(T t) {
        if(set.contains(t))     // present, cioè se s è già presente nel set
            return false;
        trash.remove(t);        // trash, cioè se s è presente nel trash (poi aggiungo nel set e restituisco true)
        return set.add(t);      // absent, cioè t viene aggiunto al set
    }

    public synchronized boolean remove(T t) {
        if(trash.contains(t)) { // trash
            trash.remove(t);
            return true;
        }
        if(!set.contains(t))    // absent
            return false;
        set.remove(t);          // present, set contiene t, lo elimino e lo inserisco nel trash
        trash.add(t);
        return true;
    }

    public synchronized boolean contains(T t) {
        if(!set.contains(t) || trash.contains(t))    // absent e anche trash
            return false;
        return true;    // present, l'unica volta in cui restituisco true è quando t è presente in set
    }
}
