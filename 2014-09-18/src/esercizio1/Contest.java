package esercizio1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Contest<T> {

    private int max;

    private T winner;

    private final Map<T, Integer> map;

    public Contest() {
        map = new HashMap<>();
    }

    public void add(T t) {
        map.put(t, 0);
    }

    public void vote(T t) {
        if(map.get(t) == null)
            throw new RuntimeException("L’oggetto \"" + t + "\" non partecipa al concorso");
        map.put(t, map.get(t) + 1);
        if(map.get(t) > this.max) {
            this.max = map.get(t);
            winner = t;
        }
    }

    public T winner() {
        return winner;
    }
}
