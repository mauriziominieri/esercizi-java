package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Volo e Passeggero, 2009-1-15)
Si implementino la classe Volo e la classe Passeggero. Il costruttore della classe Volo prende come
argomenti l’istante di partenza e l’istante di arrivo del volo (due numeri interi). Il metodo add
permette di aggiungere un passeggero a questo volo. Se il passeggero che si tenta di inserire è
già presente in un volo che si accavalla con questo, il metodo add lancia un’eccezione.
Esempio d’uso:
    Volo v1 = new Volo(1000, 2000);
    Volo v2 = new Volo(1500, 3500);
    Volo v3 = new Volo(3000, 5000);
    Passeggero mario = new Passeggero("Mario");
    Passeggero luigi = new Passeggero("Luigi");
    v1.add(mario);
    v1.add(luigi);
    v3.add(mario);
    // La seguente istruzione provoca l ’ eccezione
    v2.add(mario);
Output dell’esempio d’uso:
    Exception in thread "main"...
 */

public class Main {
    public static void main(String[] args) {
        Volo v1 = new Volo(1000, 2000);
        Volo v2 = new Volo(1500, 3500);
        Volo v3 = new Volo(3000, 5000);
        Passeggero mario = new Passeggero("Mario");
        Passeggero luigi = new Passeggero("Luigi");
        v1.add(mario);
        v1.add(luigi);
        v3.add(mario);
        // La seguente istruzione provoca l ’ eccezione
        v2.add(mario);
    }
}
