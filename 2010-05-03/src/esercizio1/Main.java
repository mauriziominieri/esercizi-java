package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Si implementi la classe Crosswords, che rappresenta uno schema di parole crociate, inizialmente
vuoto. Il costruttore accetta le dimensioni dello schema. Il metodo addWord aggiunge una parola
allo schema e restituisce true, a patto che la parola sia compatibile con quelle precedentemente
inserite; altrimenti, restituisce false senza modificare lo schema. Il metodo prende come argomenti
le coordinate iniziali della parola, la parola stessa e la direzione (H per orizzontale e V per
verticale).
Le regole di compatibilità sono:
• Una parola non si può sovrapporre ad un’altra della stessa direzione.
• Una parola si può incrociare con un’altra solo su di una lettera comune.
• Ogni parola deve essere preceduta e seguita da un bordo o da una casella vuota.
Non è necessario implementare il metodo toString. E’ opportuno implementare le direzioni H e
V in modo che siano le uniche istanze del loro tipo.
Suggerimenti:
• Per evitare di scrivere separatamente i due casi per orizzontale e verticale, è possibile aggiungere i metodi getChar/setChar, che prendono come argomenti una riga r, una colonna
c, una direzione d (H o V) e un offset x, e leggono o scrivono il carattere situato a distanza
x dalla casella r, c, in direzione d.
• Il metodo s.charAt(i) restituisce il carattere i-esimo della stringa s (per i compreso tra 0 e
s.length()-1).
Esempio d’uso:
    Crosswords c = new Crosswords(6, 8);
    System.out.println(c.addWord(0,3, "casa", Crosswords.V));
    System.out.println(c.addWord(2,1, "naso", Crosswords.H));
    System.out.println(c.addWord(2,0, "pippo", Crosswords.H));
    System.out.println(c);
Output dell’esempio d’uso:
    true
    true
    false
    c
    a
    *naso*
    a
    *
 */

public class Main {
    public static void main(String[] args) {
        Crosswords c = new Crosswords(6, 8);
        System.out.println(c.addWord(0,3, "casa", Crosswords.V));
        System.out.println(c.addWord(2,1, "naso", Crosswords.H));
        System.out.println(c.addWord(2,0, "pippo", Crosswords.H));
        System.out.println(c);
    }
}
