package esercizio1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class RotatingList<T> {

    private final List<T> list;

    public RotatingList() {
        list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    public void rotateLeft() {
        list.add(list.size(),  list.get(0));
        list.remove(0);
    }

    public void rotateRight() {
        list.add(0,  list.get(list.size() - 1));
        list.remove(list.size() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RotatingList<T> rotatingList = (RotatingList<T>) o;
        for(T t : list)
            if(!rotatingList.list.contains(t))
                return false;
        for(T t : rotatingList.list)
            if(!list.contains(t))
                return false;
        return true;
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
