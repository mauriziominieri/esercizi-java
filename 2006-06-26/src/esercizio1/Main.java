package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Moto bidimensionale, 2006-6-26)
Nel contesto di un programma di simulazione per la cinematica, si implementi una classe Body
che rappresenta un corpo puntiforme dotato di posizione nel piano cartesiano e di velocità. Il
costruttore della classe prende come argomento le coordinate alle quali si trova inizialmente il
corpo; il corpo si suppone inizialmente in quiete. Il metodo setSpeed prende il valore della velocità
lungo i due assi di riferimento. Si supponga che la posizione sia espressa in metri e la velocità in
metri al secondo. Il metodo progress simula il passaggio di un dato numero di secondi, andando
ad aggiornare la posizione del corpo. Il metodo toString va ridefinito in modo da mostrare la
posizione corrente del corpo.
Esempio d’uso:
    Body b = new Body(0, 0);
    b.setSpeed(1,−1.5);
    System.out.println(b);
    b.progress(1);
    System.out.println(b);
    b.progress(2);
    System.out.println(b);
Output del codice precedente:
    0.0, 0.0
    1.0, -1.5
    3.0, -4.5
 */

public class Main {
    public static void main(String[] args) {
        Body b = new Body(0, 0);
        b.setSpeed(1,-1.5);
        System.out.println(b);
        b.progress(1);
        System.out.println(b);
        b.progress(2);
        System.out.println(b);
    }
}
