package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Relation2, 2023-2-22)
Realizzare la classe parametrica Relation<S,T>, che rappresenta una relazione binaria tra oggetti
di tipo S e oggetti di tipo T.
Il metodo put aggiunge una coppia di oggetti alla relazione. Aggiungere due volte la stessa coppia
non deve avere nessun effetto.
Il metodo inverse restituisce la relazione inversa in tempo costante (indipendente dal numero di
coppie presenti).
Il metodo isFunctional restituisce vero se per ogni oggetto a di tipo S esiste al più un oggetto b
di tipo T che è in relazione con a.
Esempio d’uso:
    Relation<String,Integer> r = new Relation<>();
    r.put("a", 1); r.put("b", 2); r.put("c", 3);
    r.put("b", 20); r.put("c", 30);
    Relation<Integer,String> r1 = r.inverse() ;
    System.out.println(r.isFunctional ());
    System.out.println(r1.isFunctional ());
Output:
    false
    true
 */

public class Main {
    public static void main(String[] args) {
        Relation<String, Integer> r = new Relation<>();
        r.put("a", 1);
        r.put("b", 2);
        r.put("c", 3);
        r.put("b", 20);
        r.put("c", 30);
        Relation<Integer, String> r1 = r.inverse();
        System.out.println(r.isFunctional());
        System.out.println(r1.isFunctional());
    }
}
