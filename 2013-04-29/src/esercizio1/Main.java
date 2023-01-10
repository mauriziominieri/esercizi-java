package esercizio1;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(City, 2013-4-29)
La classe City rappresenta una città. Il costruttore accetta il nome della città, mentre il metodo
connect accetta un’altra città e stabilisce un collegamento tra le due (una strada o un altro tipo
di collegamento). Tutti i collegamenti sono bidirezionali.
Il metodo getConnections restituisce la collezione delle città direttamente collegate a questa. Il
metodo isConnected prende come argomento un’altra città e restituisce vero se è collegata a this
direttamente o indirettamente (cioè, tramite un numero arbitrario di collegamenti).
Esempio d’uso:
    City n = new City("Napoli"), r = new City("Roma"), s = new City
    ("Salerno"), p = new City("Parigi");
    n.connect(s);
    n.connect(r);
    Collection<City> r_conn = r.getConnections();
    System.out.println(r_conn);
    System.out.println(r.isConnected(s));
    System.out.println(r.isConnected(p));
Output:
    [Napoli]
    true
    false
 */

public class Main {
    public static void main(String[] args) {
        City n = new City("Napoli"), r = new City("Roma"), s = new City
                ("Salerno"), p = new City("Parigi");
        n.connect(s);
        n.connect(r);
        Collection<City> r_conn = r.getConnections();
        System.out.println(r_conn);
        System.out.println(r.isConnected(s));
        System.out.println(r.isConnected(p));
    }
}
