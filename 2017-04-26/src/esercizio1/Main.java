package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Room, 2017-4-26)
Realizzare le classi Room e Reservation, che rappresentano una camera d’albergo e una prenotazione per la camera. Il metodo reserve di Room accetta un nome, la data di
inizio e di fine prenotazione, e restituisce un oggetto di tipo Reservation. Se la camera è occupata
in una delle giornate richieste, il metodo lancia un’eccezione. Per semplicità, una data è rappresentata da un numero intero tra 0 a 365. Il metodo reservations di Room consente di scorrere
l’elenco delle prenotazioni, in ordine cronologico.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Room r = new Room();
    Reservation p1 = r.reserve("Pasquale␣Cafiero", 105, 120);
    Reservation p2 = r.reserve("Carlo␣Martello", 5, 20);
    Reservation p3 = r.reserve("Piero", 20, 22);
    Reservation p4 = r.reserve("Marinella", 200, 222);
    for (Reservation p: r. reservations ())
    System.out.println(p.getName());
Output:
    Carlo Martello
    Piero
    Pasquale Cafiero
    Marinella
 */

public class Main {
    public static void main(String[] args) {
        Room r = new Room();
        Reservation p1 = r.reserve("Pasquale Cafiero", 105, 120);
        Reservation p2 = r.reserve("Carlo Martello", 5, 20);
        Reservation p3 = r.reserve("Piero", 20, 22);
        Reservation p4 = r.reserve("Marinella", 200, 222);
        for (Reservation p: r.reservations())
            System.out.println(p.getName());
    }
}
