package esercizio1b;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Bijection, 2012-9-3)
Implementare la classe parametrica Bijection, che rappresenta una biezione (relazione biunivoca)
tra un insieme di chiavi e uno di valori. Il metodo addPair aggiunge una coppia chiave-valore alla
relazione. Se la chiave oppure il valore sono già presenti, viene lanciata un’eccezione. Il metodo
getValue accetta come argomento una chiave e restituisce il valore associato, oppure null se la
chiave non è presente. Il metodo getKey accetta un valore e restituisce la chiave corrispondente,
oppure null se il valore non è presente. Entrambi i metodi getValue e getKey devono operare in
tempo costante.
Esempio d’uso:
    Bijection<Integer,String> b = new Bijection<Integer,String>();
    b.addPair(12,"dodici");
    b.addPair(7,"sette");
    System.out.println(b.getValue(12));
    System.out.println(b.getKey("tredici"));
    b.addPair(8,"sette");
Output:
    dodici
    null
    Exception in thread "main" ...
 */

public class Main {
    public static void main(String[] args) {
        Bijection<Integer,String> b = new Bijection<Integer,String>();
        b.addPair(12,"dodici");
        b.addPair(7,"sette");
        System.out.println(b.getValue(12));
        System.out.println(b.getKey("tredici"));
        b.addPair(8,"sette");
    }
}
