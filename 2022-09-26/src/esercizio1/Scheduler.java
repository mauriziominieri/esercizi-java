package esercizio1;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Scheduler {
    private final Queue<Task> taskQueue;
    private Thread currentTaskThread;

    public Scheduler() {
        taskQueue = new PriorityQueue<>(); // ordina i task in base alla loro priorità.
        currentTaskThread = null;
    }

    /*
    Aggiunge un nuovo task alla coda dei task. Il parametro priority specifica la priorità del task. Viene utilizzato il metodo offer()
    della coda (taskQueue) per aggiungere il task in modo che venga ordinato automaticamente in base alla sua priorità.
    Dopo l'aggiunta di un nuovo task, viene chiamato notify() per svegliare eventuali thread in attesa di un nuovo task.
     */
    public synchronized void addTask(Runnable task, int priority) {
        taskQueue.offer(new Task(task, priority));
        notify(); // Notify the waiting thread that a new task is added.
    }

    /*
    Avvia il thread che esegue i task. Controlla se il thread corrente (currentTaskThread) è nullo o se non è in esecuzione.
    Se è così, crea un nuovo thread anonimo che cicla continuamente finché ci sono task nella coda.
    Quando la coda è vuota, il thread si mette in attesa tramite wait(). Quando un nuovo task viene aggiunto alla coda,
    il thread viene svegliato e esegue il prossimo task in ordine di priorità.
     */
    public synchronized void start() {
        if (currentTaskThread == null || !currentTaskThread.isAlive()) {
            currentTaskThread = new Thread(() -> {
                while (true) {
                    Task nextTask;
                    synchronized (Scheduler.this) {
                        while (taskQueue.isEmpty()) {
                            try {
                                wait(); // Wait until there is a task in the queue.
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                return; // Exit the thread if interrupted.
                            }
                        }
                        nextTask = taskQueue.poll();
                    }
                    nextTask.run();
                }
            });
            currentTaskThread.start();
        }
    }

    /*
    Interrompe il thread corrente se è in esecuzione. Viene chiamato interrupt() sul thread corrente per interromperlo.
     */
    public synchronized void stop() {
        if (currentTaskThread != null && currentTaskThread.isAlive())
            currentTaskThread.interrupt();
    }

    /*
    Rappresenta un task da eseguire. Implementa l'interfaccia Comparable per consentire il confronto tra i task in base alla priorità.
    I task vengono ordinati in modo che quelli con priorità più alta vengano eseguiti per primi.
     */
    private static class Task implements Comparable<Task> {
        private final Runnable task;
        private final int priority;

        public Task(Runnable task, int priority) {
            this.task = task;
            this.priority = priority;
        }

        public void run() {
            task.run();
        }

        @Override
        public int compareTo(Task other) {
            return Integer.compare(other.priority, this.priority);
        }
    }
}
