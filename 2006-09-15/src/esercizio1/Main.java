package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(FallingBody, 2006-9-15)
Nel contesto di un programma di simulazione per la cinematica, si implementi una classe FallingBody
che rappresenta un corpo puntiforme dotato di massa, che cade soggetto solo alla forza di
gravità terrestre. Il costruttore della classe prende come argomento la massa del corpo e la sua
altezza iniziale. Si supponga che tutte le grandezze siano espresse in unità tra loro omogenee
(altezza in metri, velocità in metri al secondo, etc.). Il metodo progress simula il passaggio di un
dato numero di secondi. Il metodo toString va ridefinito in modo da mostrare l’altezza dal suolo
e la velocità corrente del corpo. Non deve essere possibile creare sottoclassi di FallingBody.
Si supponga che l’accelerazione di gravità sia pari a 10 ms2 . Si ricordano le equazioni del moto
uniformemente accelerato.
v = v0 + at; s = s0 + v0t + 1/2 at^2.
Esempio d’uso:
    // Corpo di 2 kili , ad un’altezza di 20 metri.
    FallingBody b = new FallingBody(2, 20);
    System.out.println(b);
    b.progress(1);
    System.out.println(b);
    b.progress(1);
    System.out.println(b);
    b.progress(7);
    System.out.println(b);
Output dell’esempio d’uso:
    altezza: 20.0, velocita’: 0.0
    altezza: 15.0, velocita’: 10.0
    altezza: 0.0, velocita’: 0.0
    altezza: 0.0, velocita’: 0.0
 */

public class Main {
    public static void main(String[] args) {
        // Corpo di 2 kili , ad un’altezza di 20 metri.
        FallingBody b = new FallingBody(2, 20);
        System.out.println(b);
        b.progress(1);
        System.out.println(b);
        b.progress(1);
        System.out.println(b);
        b.progress(7);
        System.out.println(b);
    }
}
