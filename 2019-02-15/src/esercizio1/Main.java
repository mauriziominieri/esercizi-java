package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Range, 2019-2-15)
Realizzare la classe parametrica Range, che rappresenta un intervallo di oggetti dotati di ordinamento naturale, con le seguenti funzionalità:
a) Il costruttore accetta gli estremi dell’intervallo (l’oggetto minimo e l’oggetto massimo).
b) Il metodo isInside accetta un oggetto x e restituisce true se e solo se x appartiene all’intervallo.
c) Il metodo isOverlapping accetta un altro intervallo x e restituisce true se e solo se x è
sovrapposto a questo intervallo (cioè se i due hanno intersezione non vuota).
d) Il metodo equals è ridefinito in modo che due intervalli con gli stessi estremi risultino uguali.
e) Il metodo hashCode è ridefinito in modo da essere coerente con equals.
Porre attenzione alla firma di isOverlapping e spiegare se è completa o meno.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Range<Integer> a = new Range<>(10, 20);
    System.out.println(a. isInside (10));
    System.out.println(a. isInside (50));
    Range<String> b = new Range<>("albero", "dirupo"),
    c = new Range<>("casa", "catrame");
    System.out.println(b.isOverlapping(c));
    Range<Object> d = new Range<>(); // errore di compilazione
Output:
    true
    false
    true
 */

public class Main {
    public static void main(String[] args) {
        Range<Integer> a = new Range<>(10, 20);
        System.out.println(a. isInside (10));
        System.out.println(a. isInside (50));
        Range<String> b = new Range<>("albero", "dirupo"),
                c = new Range<>("casa", "catrame");
        System.out.println(b.isOverlapping(c));
//        Range<Object> d = new Range<>(); // errore di compilazione
    }
}
