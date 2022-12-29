package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(ParkingLot, 2007-7-20)
Implementare una classe ParkingLot, che rappresenta un parcheggio con posti auto disposti secondo una griglia m × n.
Il costruttore prende come argomenti le dimensioni m ed n del parcheggio.
Il metodo carIn aggiunge un veicolo al parcheggio e restituisce la riga e la colonna del posto
assegnato al nuovo veicolo, oppure null se il parcheggio è pieno. Il metodo carOut prende come
argomenti le coordinate di un veicolo che sta lasciando il parcheggio e restituisce il numero di
secondi trascorsi dal veicolo nel parcheggio, oppure null se alle coordinate indicate non si trova
alcun veicolo.
Suggerimento: utilizzare la classe java.util.Date per misurare il tempo.
Esempio d’uso:
    ParkingLot p = new ParkingLot(10, 10);
    Pair<Integer> pos1 = p.carIn();
    Pair<Integer> pos2 = p.carIn();
    Thread.sleep(1000);
    int sec1 = p.carOut(pos1);
    Thread.sleep(1000);
    int sec2 = p.carOut(pos2);
    System.out.println("("+pos1.getFirst()+",␣"+pos1.getSecond()+"),␣"+sec1);
    System.out.println("("+pos2.getFirst()+",␣"+pos2.getSecond()+"),␣"+sec2);
Output:
    (0, 0), 1
    (0, 1), 2
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot p = new ParkingLot(10, 10);
        Pair<Integer> pos1 = p.carIn();
        Pair<Integer> pos2 = p.carIn();
        Thread.sleep(1000);
        int sec1 = p.carOut(pos1);
        Thread.sleep(1000);
        int sec2 = p.carOut(pos2);
        System.out.println("("+pos1.getFirst()+", "+pos1.getSecond()+"), "+sec1);
        System.out.println("("+pos2.getFirst()+", "+pos2.getSecond()+"), "+sec2);
    }
}
