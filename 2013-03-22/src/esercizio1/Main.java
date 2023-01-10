package esercizio1;

import java.util.Comparator;
import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Auditorium, 2013-3-22)
La seguente classe (semplificata) Seat rappresenta un posto in un auditorium.
public class Seat { public int row, col; }
La classe Auditorium serve ad assegnare i posti in un teatro. Il costruttore prende come argomenti
le dimensioni della platea, in termini di file e posti per fila, nonché un oggetto Comparator che
serve ad ordinare i posti in ordine di preferenza. Il metodo assignSeats prende come argomenti
il numero n di posti richiesti e restituisce un insieme contenente gli n posti migliori (in base
al comparatore) ancora disponibili. Se la platea non contiene n posti disponibili, il metodo
restituisce null.
Esempio d’uso:
    Auditorium a = new Auditorium(5, 5, new Comparator<Seat>() {
        public int compare(Seat a, Seat b) {
            return (a.row==b.row)? (a.col−b.col): (a.row−b.row);
        }
    });
    Set<Seat> s = a.assignSeats(4);
    System.out.println(s);
Output:
    [(0,0),(0,1),(0,2),(0,3)]
 */

public class Main {
    public static void main(String[] args) {
        Auditorium a = new Auditorium(5, 5, new Comparator<Seat>() {
            public int compare(Seat a, Seat b) {
                return (a.row==b.row)? (a.col-b.col): (a.row-b.row);
            }
        });
        Set<Seat> s = a.assignSeats(4);
        System.out.println(s);
    }
}
