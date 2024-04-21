package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Storage, 2023-1-19)
Implementare la classe parametrica Storage, che rappresenta un deposito di oggetti. Oltre a un
costruttore senza argomenti, la classe deve supportare i seguenti metodi:
• Il metodo put, che accetta un oggetto e un numero n, e aggiunge n esemplari di quell’oggetto
al deposito.
• Il metodo take, che preleva un esemplare di un oggetto dal deposito. Se quell’oggetto non è
presente nel deposito, il metodo lancia un’eccezione.
• Il metodo mostCommon che restituisce l’oggetto di cui sono presenti più esemplari nel
deposito. Questo metodo deve terminare in tempo costante.
Esempio d’uso:
    Storage<String> s = new Storage<>();
    s.put("A", 10);
    s.put("B", 100);
    System.out.println(s.mostCommon());
    s.put("A", 90);
    s.take("B");
    System.out.println(s.mostCommon());
Output:
    B
    A
 */

public class Main {
    public static void main(String[] args) {
        Storage<String> s = new Storage<>();
        s.put("A", 10);
        s.put("B", 100);
        System.out.println(s.mostCommon());
        s.put("A", 90);
        s.take("B");
        System.out.println(s.mostCommon());
    }
}
