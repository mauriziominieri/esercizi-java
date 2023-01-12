package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Circle, 2009-4-23)
Nell’ambito di un programma di geometria, la classe Circle rappresenta una circonferenza sul
piano cartesiano. Il suo costruttore accetta le coordinate del centro ed il valore del raggio. Il
metodo overlaps prende come argomento un’altra circonferenza e restituisce vero se e solo se le
due circonferenze hanno almeno un punto in comune.
Fare in modo che Circle implementi Comparable, con il seguente criterio di ordinamento: una
circonferenza è “minore” di un’altra se è interamente contenuta in essa, mentre se nessuna delle
due circonferenze è contenuta nell’altra, esse sono considerate “uguali”. Dire se tale criterio di
ordinamento è valido, giustificando la risposta.
Esempio d’uso:
    Circle c1 = new Circle(0,0,2);
    Circle c2 = new Circle(1,1,1);
    System.out.println(c1.overlaps(c2));
    System.out.println(c1.compareTo(c2));
Output dell’esempio d’uso:
    true
    0
 */

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(0,0,2);
        Circle c2 = new Circle(1,1,1);
        System.out.println(c1.overlaps(c2));
        System.out.println(c1.compareTo(c2));
    }
}
