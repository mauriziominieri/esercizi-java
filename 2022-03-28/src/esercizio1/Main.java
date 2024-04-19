package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Angle, 2022-3-28)
Implementare la classe Angle, che rappresenta un angolo, e le sottoclassi Acute, Right, e Obtuse.
Gli angoli si misurano in gradi sessagesimali e devono essere dotati di ordinamento naturale. La
classe Angle offre il metodo statico of, che crea un angolo del valore dato e del tipo corrispondente.
Ad esempio, la chiamata Angle.of(30) deve restituire un oggetto di tipo effettivo Acute.
Le sottoclassi Acute e Obtuse hanno un costruttore pubblico che accetta il valore dell’angolo. La
classe Right, invece, deve essere un Singleton, la cui unica istanza è accessibile solo tramite la
chiamata Angle.of(90). Infine, non deve essere possibile istanziare oggetti di tipo effettivo Angle.
A partire da Java 16, le classi interne possono avere attributi statici non costanti.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Angle a = Angle.of(30.0);
    Angle.Acute b = new Angle.Acute(20.0);
    Angle c = Angle.of(90.0);
    Angle d = Angle.of(90.0);
    Angle.Obtuse e = (Angle.Obtuse) Angle.of(120.5);
    System.out.println(a == b);
    System.out.println(a.getClass() == b.getClass());
    System.out.println(c == d);
    System.out.println(a.compareTo(b));
Output:
    false
    true
    true
    1
 */

public class Main {
    public static void main(String[] args) {
        Angle a = Angle.of(30.0); // tipo effettivo Acute
        Angle.Acute b = new Angle.Acute(20.0); // tipo effettivo Acute
        Angle c = Angle.of(90.0);
        Angle d = Angle.of(90.0);
        Angle.Obtuse e = (Angle.Obtuse) Angle.of(120.5);
        System.out.println(a == b); // stessa istanza?
        System.out.println(a.getClass() == b.getClass()); // stesso tipo effettivo?
        System.out.println(c == d); // stessa istanza?
        System.out.println(a.compareTo(b));
    }
}
