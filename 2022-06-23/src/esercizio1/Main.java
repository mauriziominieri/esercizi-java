package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(MultiQueue, 2022-6-23)
Implementare la classe parametrica MultiQueue, che rappresenta un insieme di code FIFO con
carico bilanciato.
Il costruttore accetta il numero n di code da gestire. Il metodo add aggiunge un oggetto a una
delle code che in quel momento contengono meno oggetti. Il metodo get accetta un intero i
compreso tra 0 e n − 1 e rimuove e restituisce l’oggetto in testa alla coda i-esima, mettendo il
chiamante in attesa se quella coda è vuota.
La classe deve essere thread-safe e rispettare il seguente esempio d’uso.
Esempio d’uso:
    MultiQueue<String> q = new MultiQueue<>(3);
    q.add("uno");
    q.add("due");
    q.add("tre");
    q.add("quattro");
    String s = q.get(0);
Output: Una delle stringhe “uno”, “due”, o “tre”.
 */

public class Main {
    public static void main(String[] args) {
        MultiQueue<String> q = new MultiQueue<>(3);
        q.add("uno");
        q.add("due");
        q.add("tre");
        q.add("quattro");
        try {
            String s = q.get(0);
            System.out.println(s); // Output: Una delle stringhe “uno”, “due”, o “tre”.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
