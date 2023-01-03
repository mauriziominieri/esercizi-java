package esercizio1;

import java.util.Set;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Relation, 2015-1-20)
Realizzare la classe Relation, che rappresenta una relazione binaria tra un insieme S e un insieme
T. In pratica, una Relation è analoga ad una Map, con la differenza che la Relation accetta chiavi
duplicate.
Il metodo put aggiunge una coppia di oggetti alla relazione. Il metodo remove rimuove una coppia
di oggetti dalla relazione. Il metodo image accetta un oggetto x di tipo S e restituisce l’insieme
degli oggetti di tipo T che sono in relazione con x. Il metodo preImage accetta un oggetto x di
tipo T e restituisce l’insieme degli oggetti di tipo S che sono in relazione con x.
Esempio d’uso:
    Relation<Integer,String> r = new Relation<Integer,String>();
    r.put(0, "a"); r.put(0, "b"); r.put(0, "c");
    r.put(1, "b"); r.put(2, "c");
    r.remove(0, "a");
    Set<String> set0 = r.image(0);
    Set<Integer> setb = r.preImage("b");
    System.out.println(set0);
    System.out.println(setb);
Output:
    [b, c]
    [0, 1]
 */

public class Main {
    public static void main(String[] args) {
        Relation<Integer,String> r = new Relation<Integer,String>();
        r.put(0, "a"); r.put(0, "b"); r.put(0, "c");
        r.put(1, "b"); r.put(2, "c");
        r.remove(0, "a");
        Set<String> set0 = r.image(0);
        Set<Integer> setb = r.preImage("b");
        System.out.println(set0);
        System.out.println(setb);
    }
}
