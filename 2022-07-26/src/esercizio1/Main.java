package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Type, 2022-7-26)
Implementare la classe Type, che rappresenta una classe Java.
Il costruttore che accetta un nome crea un tipo con quel nome, che non estende altre classi. Il
costruttore che accetta un nome e un altro Type crea un tipo con quel nome, che estende l’altro
Type.
Il metodo isSubtypeOf accetta un altro Type e restituisce vero se questo tipo è sottotipo dell’altro.
Non deve essere possibile creare due tipi con lo stesso nome.
Esempio d’uso:
    Type A = new Type("A");
    Type B = new Type("B", A);
    Type C = new Type("C", A);
    Type D = new Type("D", B);
    System.out.println(D);
    System.out.println(B.isSubtypeOf(A));
    System.out.println(D.isSubtypeOf(A));
    System.out.println(B.isSubtypeOf(C));
    Type A2 = new Type("A", D);
Output:
    class D extends B
    true
    true
    false
    Exception in thread "main" ...
 */

public class Main {
    public static void main(String[] args) {
        Type A = new Type("A");
        Type B = new Type("B", A);
        Type C = new Type("C", A);
        Type D = new Type("D", B);
        System.out.println(D);
        System.out.println(B.isSubtypeOf(A));
        System.out.println(D.isSubtypeOf(A));
        System.out.println(B.isSubtypeOf(C));
        Type A2 = new Type("A", D);
    }
}
