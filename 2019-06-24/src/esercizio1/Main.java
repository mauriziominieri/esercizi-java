package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(SortedList, 2019-6-24)
Realizzare la classe SortedList, che rappresenta una lista di oggetti dotati di ordinamento naturale.
Come una normale lista, una SortedList accetta duplicati. Inoltre, è iterabile e i suoi iteratori la
percorrono in ordine non decrescente.
Nessun metodo di questa classe può avere una complessità superiore a O(n), dogve n è la
lunghezza della lista.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    SortedList<Integer> list = new SortedList<>();
    list .add(100); list .add(50); list .add(25); list .add(50);
    for (Integer n: list )
        System.out.println(n);
Output:
    25
    50
    50
    100

Suggerimento: si consideri il metodo void add(int i, T element) dell’interfaccia List<T>, che inserisce un elemento alla posizione i-esima,
spostando tutti gli elementi successivi di una posizione.
 */

public class Main {
    public static void main(String[] args) {
        SortedList<Integer> list = new SortedList<>();
        list.add(100); list.add(50); list.add(25); list.add(50);
        for (Integer n: list)
            System.out.println(n);
    }
}
