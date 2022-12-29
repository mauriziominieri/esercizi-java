package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Genealogia, 2007-4-26)
Nell’ambito di un programma di genealogia, si implementi la classe (o interfaccia) Person e le
sottoclassi Man e Woman, con le seguenti caratteristiche. Una persona è dotata di nome e
cognome. Il metodo addChild di Person prende una persona x come argomento e segnala che x
è figlia di this. Il metodo marries di Person prende una persona x come argomento e segnala che
x è sposata con this. Il metodo marries lancia un’eccezione se x è dello stesso genere di this. Il
metodo statico areSiblings prende come argomenti due persone x e y e restituisce vero se x ed y
sono fratelli o sorelle e falso altrimenti.
Esempio d’uso:
    Person a = new Man("Mario", "Rossi");
    Person b = new Woman("Luisa", "Verdi");
    Person c = new Man("Luca", "Rossi");
    Person d = new Woman("Anna", "Rossi");
    Person e = new Woman("Daniela", "Rossi");
    a.marries(b);
    a.addChild(c);
    b.addChild(d);
    c.addChild(e);
    System.out.println(Person.areSiblings (a, b));
    System.out.println(Person.areSiblings (c, d));
Output dell’esempio d’uso:
    false
    true
 */

public class Main {
    public static void main(String[] args) {
        Person a = new Man("Mario", "Rossi");
        Person b = new Woman("Luisa", "Verdi");
        Person c = new Man("Luca", "Rossi");
        Person d = new Woman("Anna", "Rossi");
        Person e = new Woman("Daniela", "Rossi");
        a.marries(b);
        a.addChild(c);
        b.addChild(d);
        c.addChild(e);
        System.out.println(Person.areSiblings(a, b));
        System.out.println(Person.areSiblings(c, d));
    }
}
