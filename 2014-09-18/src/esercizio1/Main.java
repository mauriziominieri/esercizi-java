package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Contest, 2014-9-18)
Un oggetto di tipo Contest consente ai client di votare per uno degli oggetti che partecipano a
un “concorso”. Implementare la classe parametrica Contest con i seguenti metodi: il metodo add
consente di aggiungere un oggetto al concorso; il metodo vote permette di votare per un oggetto;
se l’oggetto passato a vote non partecipa al concorso (cioè non è stato aggiunto con add), viene
lanciata un’eccezione; il metodo winner restituisce uno degli oggetti che fino a quel momento ha
ottenuto più voti.
Tutti i metodi devono funzionare in tempo costante.
Esempio d’uso:
    Contest<String> c = new Contest<String>();
    String r = "Red", b = "Blue", g = "Green";
    c.add(r);
    c.vote(r);
    c.add(b);
    c.add(g);
    c.vote(r);
    c.vote(b);
    System.out.println(c.winner());
Output:
    Red
 */

public class Main {
    public static void main(String[] args) {
        Contest<String> c = new Contest<String>();
        String r = "Red", b = "Blue", g = "Green";
        c.add(r);
        c.vote(r);
        c.add(b);
        c.add(g);
        c.vote(r);
        c.vote(b);
        System.out.println(c.winner());
    }
}
