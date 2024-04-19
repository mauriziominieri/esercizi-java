package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(WeightedSet, 2022-5-2)
Implementare la classe parametrica WeightedSet (insieme pesato), che rappresenta un insieme in
cui ad ogni oggetto è associato un peso intero.
Il metodo add aggiunge un oggetto con un dato peso. Ad ogni oggetto può essere associato un
unico peso, mentre oggetti diversi possono avere lo stesso peso.
Il metodo atLeast accetta un peso p e restituisce una vista sull’insieme degli oggetti di peso
maggiore o uguale di p. Questa vista supporta l’inserimento di nuovi oggetti con add, ma solo se
il loro peso è almeno p, altrimenti add deve lanciare un’eccezione.
Il metodo toString di un WeightedSet deve elencare gli oggetti contenuti, senza il loro peso, ma
in ordine di peso non decrescente.
L’implementazione deve rispettare il seguente esempio d’uso.
Esempio d’uso:
    WeightedSet<Object> set = new WeightedSet<>();
    set.add(Double.valueOf(3.14), 100);
    set.add(new Object(), 5);
    set.add("Skylar", 50);
    set.add("Jesse", 5);
    System.out.println(set);
    WeightedSet<Object> set10 = set.atLeast(10);
    System.out.println(set10);
    set .add("Walter", 60);
    System.out.println(set);
    System.out.println(set10);
Output:
    [Jesse, java.lang.Object@6b95977, Skylar, 3.14]
    [Skylar, 3.14]
    [Jesse, java.lang.Object@6b95977, Skylar, Walter, 3.14]
    [Skylar, Walter, 3.14]
 */

public class Main {
    public static void main(String[] args) {
        WeightedSet<Object> set = new WeightedSet<>();
        set.add(Double.valueOf(3.14), 100);
        set.add(new Object(), 5);
        set.add("Skylar", 50);
        set.add("Jesse", 5);
        System.out.println(set);
        WeightedSet<Object> set10 = set.atLeast(10);
        System.out.println(set10);
        set.add("Walter", 60);
//        set10.add("X", 9);
        System.out.println(set);
        System.out.println(set10);
    }
}
