package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Rational, 2007-6-29)
• (18 punti) Si implementi una classe Rational che rappresenti un numero razionale in maniera
esatta. Il costruttore accetta numeratore e denominatore. Se il denominatore è negativo,
viene lanciata una eccezione. Il metodo plus prende un altro Rational x come argomento e
restituisce la somma di this e x. Il metodo times prende un altro Rational x come argomento
e restituisce il prodotto di this e x.
• (9 punti) La classe deve assicurarsi che numeratore e denominatore siano sempre ridotti ai
minimi termini. (Suggerimento: la minimizzazione della frazione può essere compito del
costruttore)
• (7 punti) La classe deve implementare l’interfaccia Comparable<Rational>, in base al normale ordinamento tra razionali.
Esempio d’uso:
    Rational n = new Rational(2,12); // due dodicesimi
    Rational m = new Rational(4,15); // quattro quindicesimi
    Rational o = n.plus(m);
    Rational p = n.times(m);
    System.out.println(n);
    System.out.println(o);
    System.out.println(p);
Output dell’esempio d’uso:
    1/6
    13/30
    2/45
 */

public class Main {
    public static void main(String[] args) {
        Rational n = new Rational(2,12); // due dodicesimi
        Rational m = new Rational(4,15); // quattro quindicesimi
        Rational o = n.plus(m);
        Rational p = n.times(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
    }
}
