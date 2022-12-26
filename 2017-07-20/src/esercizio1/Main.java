package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Realizzare la classe Cartella, che rappresenta una cartella nella Tombola. Una cartella contiene
15 numeri casuali diversi, compresi tra 1 e 90, disposti in 3 righe di 5 numeri, rispettando la
seguente regola:
• una riga non può contenere due numeri della stessa “decina”; ad esempio, una riga può
contenere 9 e 11, ma non 11 e 13.
Il metodo segna accetta il prossimo numero estratto, e controlla se questa cartella ha ottenuto
un premio, restituendo null, oppure un valore enumerato che rappresenta uno dei premi della
Tombola: AMBO, TERNO, QUATERNA, CINQUINA, TOMBOLA (implementare anche questa enumerazione).
L’implementazione deve rispettare il seguente esempio d’uso:
Esempio d’uso:
    Cartella c = new Cartella();
    System.out.println(c.segna(1));
    System.out.println(c.segna(2));
    System.out.println(c.segna(12));
    System.out.println(c.segna(22));
    System.out.println(c.segna(82));
Un output possibile:
    null
    null
    null
    AMBO
    null
 */

public class Main {
    public static void main(String[] args) {
        Cartella c = new Cartella();
        System.out.println(c.segna(1));
        System.out.println(c.segna(2));
        System.out.println(c.segna(12));
        System.out.println(c.segna(22));
        System.out.println(c.segna(82));
    }
}
