package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Monomio, 2007-2-7)
Un monomio è una espressione algebrica del tipo an · x^n, cioè è un particolare tipo di polinomio
composto da un solo termine. Implementare una classe Monomial come sottoclasse di Polynomial.
La classe Monomial deve offrire un costruttore che accetta il grado n e il coefficiente an che
identificano il monomio.
Ridefinire il metodo equals in modo che si possano confrontare liberamente polinomi e monomi,
con l’ovvio significato matematico di eguaglianza.
Esempio d’uso:
    double a1[] = {1, 2, 3};
    double a2[] = {0, 0, 0, 5};
    Polynomial p1 = new Polynomial(a1);
    Polynomial p2 = new Polynomial(a2);
    Polynomial p3 = new Monomial(3, 5);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p3.equals(p1));
    System.out.println(p3.equals(p2));
    System.out.println(p2.equals(p3));
    System.out.println(p2.equals((Object) p3));
Output dell’esempio d’uso:
    5.0 x^3
    5.0 x^3
    false
    true
    true
    true
 */

public class Main {
    public static void main(String[] args) {
        double a1[] = {1, 2, 3};
        double a2[] = {0, 0, 0, 5};
        Polynomial p1 = new Polynomial(a1);
        Polynomial p2 = new Polynomial(a2);
        Polynomial p3 = new Monomial(3, 5);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p3.equals(p1));
        System.out.println(p3.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p2.equals((Object) p3));
    }
}
