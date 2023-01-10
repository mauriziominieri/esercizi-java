package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Social network, 2012-7-9)
Nell’ambito dell’implementazione di un social network, la classe Person rappresenta un utente.
Tramite i metodi addFriend e addEnemy è possibile aggiungere un amico o un nemico a questa
persona, rispettando le seguenti regole:
a) una persona non può aggiungere se stessa come amico o nemico;
b) una persona non può aggiungere la stessa persona sia come amico sia come nemico.
Il metodo contacts permette di iterare su tutti i contatti di questa persona tramite un iteratore,
che restituirà prima tutti gli amici e poi tutti i nemici.
Esempio d’uso:
    Person a = new Person("Antonio");
    Person c = new Person("Cleopatra");
    Person o = new Person("Ottaviano");
    a.addEnemy(o);
    a.addFriend(c);
    for (Person p: a.contacts())
    System.out.println(p);
Output dell’esempio d’uso:
    Cleopatra
    Ottaviano
 */

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Antonio");
        Person c = new Person("Cleopatra");
        Person o = new Person("Ottaviano");
        a.addEnemy(o);
        a.addFriend(c);
        for (Person p: a.contacts())
            System.out.println(p);
    }
}
