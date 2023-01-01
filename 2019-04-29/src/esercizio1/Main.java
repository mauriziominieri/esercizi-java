package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(RotatingList, 2019-4-29)
Realizzare la classe RotatingList, che rappresenta una lista in grado di ruotare,
con le seguenti funzionalità:
• Un costruttore senza argomenti che crea una lista vuota.
• Il metodo add per inserire un elemento in coda.
• I metodi rotateLeft e rotateRight che ruotano la lista di una posizione.
• Un overriding di equals che consideri uguali due liste se contengono gli stessi elementi, anche
in ordine diverso e in molteplicità diversa (ad esempio, la lista [1, 2, 1] va considerata uguale
a [2, 1, 2, 2]).
Nota: le collezioni standard sovrascrivono toString in modo da stampare il proprio contenuto.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    RotatingList<Integer> l = new RotatingList<>();
    l .add(1); l .add(2); l .add(3);
    System.out.println(l );
    l . rotateLeft () ;
    System.out.println(l );
    l .add(4);
    System.out.println(l );
    l .rotateRight();
    System.out.println(l );
Output:
    [1, 2, 3]
    [2, 3, 1]
    [2, 3, 1, 4]
    [4, 2, 3, 1]
 */

public class Main {
    public static void main(String[] args) {
        RotatingList<Integer> l = new RotatingList<>();
        l.add(1); l.add(2); l.add(3);
        System.out.println(l);
        l.rotateLeft() ;
        System.out.println(l);
        l.add(4);
        System.out.println(l);
        l.rotateRight();
        System.out.println(l);
    }
}
