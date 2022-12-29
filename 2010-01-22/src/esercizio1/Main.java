package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Color, 2010-1-22)
La classe Color rappresenta un colore, determinato dalle sue componenti RGB. La classe offre
alcuni colori predefiniti, tra cui RED, GREEN e BLUE. Un colore nuovo si può creare solo con
il metodo factory make. Se il client cerca di ricreare un colore predefinito, gli viene restituito
quello e non uno nuovo. Ridefinire anche il metodo toString, in modo che rispetti il seguente caso
d’uso.
Esempio d’uso:
    Color rosso = Color.RED;
    Color giallo = Color.make(255, 255, 0);
    Color verde = Color.make(0, 255, 0);
    System.out.println(rosso);
    System.out.println( giallo );
    System.out.println(verde);
    System.out.println(verde == Color.GREEN);
Output dell’esempio d’uso:
    red
    (255, 255, 0)
    green
    true
 */

public class Main {
    public static void main(String[] args) {
        Color rosso = Color.RED;
        Color giallo = Color.make(255, 255, 0);
        Color verde = Color.make(0, 255, 0);
        System.out.println(rosso);
        System.out.println(giallo);
        System.out.println(verde);
        System.out.println(verde == Color.GREEN);   // non confronta i due hashcode, confronta proprio i riferimenti in memoria (System.identityHashCode(verde))
    }
}
