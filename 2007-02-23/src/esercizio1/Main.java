package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Inventory, 2007-2-23)
Definire una classe parametrica Inventory<T> che rappresenta un inventario di oggetti di tipo T.
Il costruttore senza argomenti crea un inventario vuoto. Il metodo add aggiunge un oggetto di
tipo T all’inventario. Il metodo count prende come argomento un oggetto di tipo T e restituisce il
numero di oggetti uguali all’argomento presenti nell’inventario. Infine, il metodo getMostCommon
restituisce l’oggetto di cui è presente il maggior numero di esemplari.
Esempio d’uso:
    Inventory<Integer> a = new Inventory<Integer>();
    Inventory<String> b = new Inventory<String>();
    a.add(7); a.add(6); a.add(7); a.add(3);
    b.add("ciao"); b.add("allora?"); b.add("ciao␣ciao"); b.add("allora?");
    System.out.println(a.count(2));
    System.out.println(a.count(3));
    System.out.println(a.getMostCommon());
    System.out.println(b.getMostCommon());
Output dell’esempio d’uso:
    0
    1
    7
    allora?
 */

public class Main {
    public static void main(String[] args) {
        Inventory<Integer> a = new Inventory<Integer>();
        Inventory<String> b = new Inventory<String>();
        a.add(7); a.add(6); a.add(7); a.add(3);
        b.add("ciao"); b.add("allora?"); b.add("ciao ciao"); b.add("allora?");
        System.out.println(a.count(2));
        System.out.println(a.count(3));
        System.out.println(a.getMostCommon());
        System.out.println(b.getMostCommon());
    }
}
