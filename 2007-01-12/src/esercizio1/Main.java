package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Polinomio, 2007-1-12)
Un polinomio è una espressione algebrica del tipo a0 +a1x+. . .+anxn. Si implementi una classe
Polynomial, dotata di un costruttore che accetta un array contenente i coefficienti a0 . . . an, e dei
seguenti metodi: getDegree restituisce il grado del polinomio; times accetta un polinomio p come
argomento e restituisce un polinomio che rappresenta il prodotto di this e p; toString produce
una stringa simile a quella mostrata nel seguente caso d’uso.
Esempio d’uso:
    double a1[] = {1, 2, 3};
    double a2[] = {2, 2};
    Polynomial p1 = new Polynomial(a1);
    Polynomial p2 = new Polynomial(a2);
    Polynomial p3 = p1.times(p2);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
Output dell’esempio d’uso:
    1.0 + 2.0 x^1 + 3.0 x^2
    2.0 + 2.0 x^1
    2.0 + 6.0 x^1 + 10.0 x^2 + 6.0 x^3
 */

public class Main {
    public static void main(String[] args) {
        double a1[] = {1, 2, 3};
        double a2[] = {2, 2};
        Polynomial p1 = new Polynomial(a1);
        Polynomial p2 = new Polynomial(a2);
        Polynomial p3 = p1.times(p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
