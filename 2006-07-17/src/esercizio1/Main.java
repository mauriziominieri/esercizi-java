package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Moto accelerato, 2006-7-17)
Nel contesto di un programma di simulazione per la cinematica, si implementi una classe Body che
rappresenta un corpo puntiforme dotato di massa, che si sposta lungo una retta. Il costruttore
della classe prende come argomento la massa del corpo. Il corpo si suppone inizialmente in quiete
alla coordinata 0. Il metodo setForce imposta il valore di una forza che viene applicata al corpo.
Si supponga che tutte le grandezze siano espresse in unità tra loro omogenee (posizione in metri,
velocità in metri al secondo, forza in Newton, etc.). Il metodo progress simula il passaggio di
un dato numero di secondi, andando ad aggiornare la posizione del corpo. Il metodo toString va
ridefinito in modo da mostrare la posizione e la velocità corrente del corpo.
Si ricordano le equazioni del moto uniformemente accelerato.
F = ma; v = v0 + at; s = s0 + v0t + 1/2at^2
Esempio d’uso:
    Body b = new Body(20);
    b.setForce(40);
    System.out.println(b);
    b.progress(1);
    System.out.println(b);
    b.progress(2);
    System.out.println(b);
    b.setForce(−100);
    b.progress(2);
    System.out.println(b);
Output dell’esempio d’uso:
    posizione: 0.0, velocita’: 0.0
    posizione: 1.0, velocita’: 2.0
    posizione: 9.0, velocita’: 6.0
    posizione: 11.0, velocita’: -4.0
 */

public class Main {
    public static void main(String[] args) {
        Body b = new Body(20);
        b.setForce(40);
        System.out.println(b);
        b.progress(1);
        System.out.println(b);
        b.progress(2);
        System.out.println(b);
        b.setForce(-100);
        b.progress(2);
        System.out.println(b);
    }
}
