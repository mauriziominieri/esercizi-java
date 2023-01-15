package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Primes, 2007-2-23)
Definire una classe Primes che rappresenta l’insieme dei numeri primi. Il campo statico iterable
fornisce un oggetto su cui si può iterare, ottenendo l’elenco di tutti i numeri primi. Non deve
essere possibile per un’altra classe creare oggetti di tipo Primes.
Suggerimento: Primes potrebbe implementare sia Iterator<Integer> che Iterable<Integer>. In tal
caso, il campo iterable potrebbe puntare ad un oggetto di tipo Primes.
Esempio d’uso:
    for (Integer i : Primes.iterable ) {
        if (i > 20) break;
        System.out.println(i );
    }
Output dell’esempio d’uso:
    1
    3
    5
    7
    11
    13
    17
    19
 */

public class Main {
    public static void main(String[] args) {
        for (Integer i : Primes.iterable) {
            if (i > 20) break;
            System.out.println(i);
        }
    }
}
