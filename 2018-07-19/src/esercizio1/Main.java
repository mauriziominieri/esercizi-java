package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Fraction, 2018-7-19)
Implementare la classe Fraction, che rappresenta una frazione, e la sottoclasse ReducedFraction,
che rappresenta una frazione irriducibile.
Due oggetti di questi tipi devono essere uguali per equals se rappresentano lo stesso numero
razionale, anche se uno è di tipo Fraction e l’altro ReducedFraction.
Oltre a un costruttore che accetta numeratore e denominatore, le due classi offrono il metodo
times, che calcola il prodotto, restituendo un nuovo oggetto Fraction. Il nuovo oggetto deve essere
di tipo effettivo ReducedFraction se e soltanto se entrambi gli operandi del prodotto sono di tipo
effettivo ReducedFraction.
Suggerimento: per calcolare il massimo comun divisore tra due interi a e b, si può usare
l’istruzione BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue().
Esempio d’uso:
    Fraction a = new Fraction(12,30), b = new ReducedFraction(12,30), c = new Fraction(1,4), d = c.times(a);
    System.out.println(a);
    System.out.println(b);
    System.out.println(d);
    System.out.println(a.equals(b));
    System.out.println(c.times(b));
Output:
    12/30
    2/5
    12/120
    true
    2/20
 */

public class Main {
    public static void main(String[] args) {
        Fraction a = new Fraction(12,30),
                b = new ReducedFraction(12,30),
                c = new Fraction(1,4),
                d = c.times(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(d);
        System.out.println(a.equals(b));
        System.out.println(c.times(b));
    }
}
