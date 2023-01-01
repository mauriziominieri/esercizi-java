package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Cellphone, 2018-9-17)
Implementare la classe Cellphone, che rappresenta un’utenza telefonica dotata di un gestore (stringa) e un numero di telefono (stringa). La classe è in grado di calcolare il costo di una telefonata,
in base al gestore di partenza, al gestore di arrivo, e alla durata.
Il metodo setCost consente di impostare il costo al minuto di una telefonata con un dato gestore
di partenza e un dato gestore di arrivo. Il metodo getCost calcola il costo di una telefonata verso
una data utenza e di una data durata (in minuti).
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Cellphone a = new Cellphone("TIMMY", "3341234"),
    b = new Cellphone("Megafon", "3355678"),
    c = new Cellphone("Odissey", "3384343");
    Cellphone.setCost("TIMMY", "TIMMY", 0.05);
    Cellphone.setCost("TIMMY", "Megafon", 0.15);
    Cellphone.setCost("Megafon", "TIMMY", 0.25);
    System.out.println(a.getCost(b, 10));
    System.out.println(b.getCost(a, 8));
    System.out.println(a.getCost(c, 10)); // provoca eccezione
Output:
    1.5
    2.0
    Exception in
    thread "main" ...
 */

public class Main {
    public static void main(String[] args) {
        Cellphone a = new Cellphone("TIMMY", "3341234"),
                b = new Cellphone("Megafon", "3355678"),
                c = new Cellphone("Odissey", "3384343");
        Cellphone.setCost("TIMMY", "TIMMY", 0.05);
        Cellphone.setCost("TIMMY", "Megafon", 0.15);
        Cellphone.setCost("Megafon", "TIMMY", 0.25);
        System.out.println(a.getCost(b, 10));
        System.out.println(b.getCost(a, 8));
        System.out.println(a.getCost(c, 10)); // provoca eccezione
    }
}
