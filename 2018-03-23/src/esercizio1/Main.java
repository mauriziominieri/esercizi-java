package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Studente, 2018-3-23)
Implementare la classe Studente e le due sottoclassi Triennale e Magistrale. Uno studente è
caratterizzato da nome e matricola. Ciascuna sottoclasse ha un prefisso che viene aggiunto a
tutte le sue matricole. Due studenti sono considerati uguali da equals se hanno lo stesso nome e
la stessa matricola (compreso il prefisso).
L’implementazione deve rispettare il seguente esempio d’uso:

Esempio d’uso:
    Studente.Triennale. setPrefisso ("N86");
    Studente.Magistrale. setPrefisso ("N97");
    Object luca1 = new Studente.Triennale("Luca", "004312"),
    luca2 = new Studente.Triennale("Luca", "004312"),
    anna1 = new Studente.Triennale("Anna", "004312"),
    anna2 = new Studente.Magistrale("Anna", "004312");
    System.out.println(luca1.equals(luca2));
    System.out.println(anna1.equals(anna2));
    System.out.println(anna1);
Output:
    true
    false
    Anna N86/004312
*/

public class Main {
    public static void main(String[] args) {
        Studente.Triennale.setPrefisso("N86");
        Studente.Magistrale.setPrefisso("N97");
        Object luca1 = new Studente.Triennale("Luca", "004312"),
                luca2 = new Studente.Triennale("Luca", "004312"),
                anna1 = new Studente.Triennale("Anna", "004312"),
                anna2 = new Studente.Magistrale("Anna", "004312");
        System.out.println(luca1.equals(luca2));
        System.out.println(anna1.equals(anna2));
        System.out.println(anna1);
    }
}
