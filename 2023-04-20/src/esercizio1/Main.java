package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Tape, 2023-4-20)
Implementare la classe Tape, che rappresenta una stringa e una posizione all’interno della stringa.
Il costruttore accetta la stringa e imposta la posizione iniziale al primo carattere. Il metodo ahead
sposta la posizione in avanti di un posto ed è concatenabile (si veda il caso d’uso). L’attributo
play consente di iterare su tutti i caratteri, a partire dalla posizione corrente. L’attributo playBack
consente di iterare su tutti i caratteri, a partire dalla posizione corrente e andando all’indietro
nella stringa. É preferibile che l’iterazione tramite play e playBack usi spazio aggiuntivo costante
(indipendente dalla lunghezza della stringa).
La classe deve ridefinire equals e hashCode in modo che siano coerenti e che l’uguaglianza sia
basata sul contenuto (stessa stringa e stessa posizione).
Suggerimento: il seguente metodo della classe String restituisce il carattere n-esimo:
public char charAt(int n)
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    Tape tape = new Tape(‘‘PollosHermanos’’);
    for (Character c: tape.play) System.out.print(c);
    System.out.println();
    for (Character c: tape.playBack) System.out.print(c);
    System.out.println();
    tape.ahead().ahead().ahead();
    for (Character c: tape.play) System.out.print(c);
    System.out.println();
    for (Character c: tape.playBack) System.out.print(c);
    System.out.println();
Output:
    PollosHermanos
    P
    losHermanos
    lloP
 */

public class Main {
    public static void main(String[] args) {
        Tape tape = new Tape("PollosHermanos");
        for (Character c: tape.play) System.out.print(c);
        System.out.println();
        for (Character c: tape.playBack) System.out.print(c);
        System.out.println();
        tape.ahead().ahead().ahead();
        for (Character c: tape.play) System.out.print(c);
        System.out.println();
        for (Character c: tape.playBack) System.out.print(c);
        System.out.println();
    }
}
