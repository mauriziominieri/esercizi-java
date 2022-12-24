package esercizio1;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class MultiSet<T> implements Iterable<T> {

    private List<T> list;

    public MultiSet() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        Random random = new Random();
        int n = random.nextInt(list.size() + 1);    // genero un numero random da 0 a list.size()
        list.add(n, element);   // es. list(0, 7) aggiunge 7 nell'indice 0, se fosse già presente il 9 verrà spostato nell'indice 1 -> [7, 9]
    }

    public void remove(T element) {
        list.remove(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultiSet<T> multiSet = (MultiSet<T>) o;
        if(this.list.size() != multiSet.list.size())
            return false;
        for(T element : multiSet.list)  // se non facessi questo controllo darebbe true con s1: [5, 5, 5]
            if(!this.list.contains(element))
                return false;
        for(T element : this.list)  // se non facessi questo controllo darebbe true con s2: [5, 5, 5]
            if(!multiSet.list.contains(element))
                return false;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
