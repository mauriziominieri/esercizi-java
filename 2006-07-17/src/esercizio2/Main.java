package esercizio2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(TwoSteps, 2006-7-17)
Implementare un metodo statico twoSteps che accetta come argomento un iteratore e restituisce
un iteratore dello stesso tipo, che compie due passi per ogni chiamata a next.
Come esempio, si consideri il seguente caso d’uso.
Esempio d’uso:
    List<Integer> l = new LinkedList<Integer>();
    l .add(3); l .add(5); l .add(7); l .add(9);
    Iterator<Integer> iter1 = twoSteps(l.iterator ());
    System.out.println("Iterazione␣1:");
    System.out.println( iter1 .next());
    System.out.println( iter1 .next());
    Iterator<Integer> iter2 = twoSteps(l.iterator ());
    System.out.println("Iterazione␣2:");
    while (iter2.hasNext())
    System.out.println( iter2 .next());
Output dell’esempio d’uso:
    Iterazione 1:
    3
    7
    Iterazione 2:
    3
    7
 */

public class Main {
    public static Iterator<Integer> twoSteps(Iterator<Integer> iterator) {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public Integer next() {
                int response = iterator.next();
                iterator.next();
                return response;
            }
        };
    }

    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        l.add(3); l.add(5); l.add(7); l.add(9);
        Iterator<Integer> iter1 = twoSteps(l.iterator());
        System.out.println("Iterazione 1:");
        System.out.println( iter1 .next());
        System.out.println( iter1 .next());
        Iterator<Integer> iter2 = twoSteps(l.iterator());
        System.out.println("Iterazione 2:");
        while (iter2.hasNext())
            System.out.println( iter2 .next());
    }
}
