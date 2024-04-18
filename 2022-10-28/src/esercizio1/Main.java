package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(BigProblem, 2022-10-28)
Implementare la classe BigProblem, che rappresenta una sequenza di eccezioni e si comporta a
sua volta come un’eccezione non verificata (unchecked). La classe deve supportare i seguenti
metodi:
• Il metodo add, che accetta un’eccezione e l’aggiunge a quest’oggetto.
• Il metodo getMessage (overriding dell’omonimo metodo in Throwable), che non accetta argomenti
e restituisce la concatenazione dei messaggi associati a tutte le eccezioni inserite in
questo oggetto, rispettando l’ordine di inserimento.
• Il metodo containsChecked che non accetta argomenti e restituisce true se almeno una delle
eccezioni inserite è verificata (checked).
Esempio d’uso:
    BigProblem bp = new BigProblem();
    bp.add(new RuntimeException("Problem␣A"));
    bp.add(new Exception("Problem␣B"));
    bp.add(new InterruptedException("Problem␣C"));
    System.out.println(bp.containsChecked());
    try {
        throw bp;
    } catch (Throwable t) {
        System.out.println(t.getMessage());
    }
Output:
    true
    Problem A
    Problem B
    Problem C
 */

public class Main {
    public static void main(String[] args) {
        BigProblem bp = new BigProblem();
        bp.add(new RuntimeException("Problem A"));
        bp.add(new Exception("Problem B"));
        bp.add(new InterruptedException("Problem C"));
        System.out.println(bp.containsChecked());
        try {
            throw bp;
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    }
}
