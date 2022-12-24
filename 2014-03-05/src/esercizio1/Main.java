package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Realizzare la classe PeriodicTask, che consente di eseguire un Runnable periodicamente, ad intervalli specificati.
Il costruttore accetta un oggetto Runnable r e un numero di millisecondi p, detto
periodo, e fa partire un thread che esegue r.run() ogni p millisecondi (si noti che il costruttore
non è bloccante). Il metodo getTotalTime restituisce il numero complessivo di millisecondi che
tutte le chiamate a r.run() hanno utilizzato fino a quel momento.
Suggerimento: il seguente metodo della classe System restituisce il numero di millisecondi trascorsi
dal primo gennaio 1970: public static long currentTimeMillis().
(15 punti) Inoltre, dire quali dei seguenti criteri di uguaglianza per oggetti di tipo PeriodicTask
sono validi, giustificando brevemente la risposta. Due oggetti di tipo PeriodicTask sono uguali se:
a) hanno lo stesso Runnable ed un periodo inferiore ad un secondo;
b) hanno due periodi che sono l’uno un multiplo intero dell’altro (ad es. 5000 millisecondi e 2500 millisecondi);
c) hanno lo stesso Runnable oppure lo stesso periodo.
Esempio d’uso:
    Runnable r = new Runnable() {
        public void run() {
            System.out.println("Ciao!");
        }
    };
    new PeriodicTask(r, 2000);
Output:
    Ciao!
    Ciao! (dopo 2 secondi)
    Ciao! (dopo altri 2 secondi)
    ...
 */

public class Main {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Ciao!");
            }
        };
        new PeriodicTask(r, 2000);
    }
}
