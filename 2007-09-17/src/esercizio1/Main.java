package esercizio1;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Selector, 2007-9-17)
L’interfaccia parametrica Selector prevede un metodo select che restituisce un valore booleano
per ogni elemento del tipo parametrico.
public interface Selector<T> {
    boolean select(T x);
}
Implementare una classe SelectorIterator che accetta una collezione e un selettore dello stesso
tipo, e permette di iterare sugli elementi della collezione per i quali il selettore restituisce true.
Esempio d’uso:
    Integer [] a = { 1, 2, 45, 56, 343, 22, 12, 7, 56};
    List<Integer> l = Arrays.asList(a);
    Selector<Integer> pari = new Selector<Integer>() {
        public boolean select(Integer n) {
            return (n % 2) == 0;
        }
    };
    for (Integer n: new SelectorIterator<Integer>(l, pari))
        System.out.print(n + "␣");
Output dell’esempio d’uso:
    2 56 22 12 56
 */

public class Main {
    public static void main(String[] args) {
        Integer [] a = {1, 2, 45, 56, 343, 22, 12, 7, 56};
        List<Integer> l = Arrays.asList(a);
        Selector<Integer> pari = new Selector<Integer>() {
            public boolean select(Integer n) {
                return (n % 2) == 0;
            }
        };
        for (Integer n: new SelectorIterator<Integer>(l, pari))
            System.out.print(n + " ");
    }
}
