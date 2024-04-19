package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(Scheduler, 2022-9-26)
Implementare la classe Scheduler, che esegue sequenzialmente (cioè, uno alla volta) una serie di
task, rispettando la loro priorità. Più precisamente, ogni oggetto Scheduler gestisce una coda di
task, ciascuno con la sua priorità, e, quando nessun task è in esecuzione, preleva dalla coda ed
esegue uno dei task con la priorità più alta.
La classe deve essere thread-safe ed offrire i seguenti metodi, tutti non bloccanti:
• Un costruttore senza argomenti.
• Il metodo addTask, che accetta un oggetto Runnable e una priorità intera e lo inserisce
nella coda dei task da eseguire. I client devono poter aggiungere più volte lo stesso oggetto
Runnable, con la stessa priorità o con priorità diverse.
• Il metodo start (senza argomenti), che avvia l’esecuzione dei task.
• Il metodo stop (senza argomenti), che interrompe il task corrente (se esiste) e ferma l’esecuzione
di ulteriori task. Dopo aver invocato stop, è ancora possibile invocare sia addTask sia start.
Esempio d’uso:
    Scheduler s = new Scheduler();
    s.addTask(() −> { System.out.println("world!"); }, 10);
    s.addTask(() −> { System.out.print("Hello "); }, 20);
    s.start();
Output:
    Hello world!
 */

public class Main {
    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        s.addTask(() -> { System.out.println("world!"); }, 10);
        s.addTask(() -> { System.out.print("Hello "); }, 20);
        s.start();
//        s.stop();
    }
}
