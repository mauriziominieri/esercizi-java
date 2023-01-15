package esercizio2;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Elevator, 2009-7-9)
Implementare la classe Elevator, che simula il comportamento di un ascensore. Il costruttore
prende come argomento il numero di piani serviti (oltre al pian terreno). Il metodo call rappresenta la prenotazione (“chiamata”) di un piano.
Se l’argomento di call è fuori dall’intervallo corretto, viene lanciata un’eccezione.
In un thread indipendente, quando ci sono chiamate in attesa, l’ascensore cambia piano in modo
da soddisfare una delle chiamate, scelta in ordine arbitrario. L’ascensore impiega due secondi
per percorrere ciascun piano e stampa a video dei messaggi esplicativi, come nel seguente caso d’uso.
Attenzione: verrà valutato negativamente l’uso di attesa attiva.
Esempio d’uso:
    Elevator e = new Elevator(10);
    e.call(8);
    e.call(5);
    e.call(3);
    e.call(4);
Output dell’esempio d’uso:
    Elevator leaves floor 0
    Elevator stops at floor 3 (dopo 6 secondi)
    Elevator leaves floor 3
    Elevator stops at floor 4 (dopo 2 secondi)
    Elevator leaves floor 4
    Elevator stops at floor 5 (dopo 2 secondi)
    Elevator leaves floor 5
    Elevator stops at floor 8 (dopo 6 secondi)
 */

public class Main {
    public static void main(String[] args) {
        Elevator e = new Elevator(10);
        e.call(8);
        e.call(5);
        e.call(3);
        e.call(4);
    }
}
