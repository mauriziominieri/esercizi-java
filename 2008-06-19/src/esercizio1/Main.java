package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Molecola, 2008-6-19)
Nell’ambito di un programma di chimica, si implementino le classi Elemento e Molecola.
Un elemento è rappresentato solo dalla sua sigla (“O” per ossigeno, etc.). Una molecola è rappresentata
dalla sua formula bruta (“H2O” per acqua, etc.), cioè dal numero di atomi di ciascun elemento
presente.
Esempio d’uso:
    Elemento ossigeno = new Elemento("O");
    Elemento idrogeno = new Elemento("H");
    Molecola acqua = new Molecola();
    acqua.add(idrogeno, 1);
    acqua.add(ossigeno, 1);
    acqua.add(idrogeno, 1);
    System.out.println(acqua);
Output dell’esempio d’uso:
    H2 O
 */

public class Main {
    public static void main(String[] args) {
        Elemento ossigeno = new Elemento("O");
        Elemento idrogeno = new Elemento("H");
        Molecola acqua = new Molecola();
        acqua.add(idrogeno, 1);
        acqua.add(ossigeno, 1);
        acqua.add(idrogeno, 1);
        System.out.println(acqua);
    }
}
