package esercizio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */
public class RandomExecutor {

    private final List<Runnable> tasks;

    private final List<Thread> threads;

    private volatile boolean launched;

    public RandomExecutor() {
        tasks = new ArrayList<>();
        threads = new ArrayList<>();
    }

    public void addTask(Runnable r) {
        if(launched)
            throw new IllegalStateException("Questo metodo può essere chiamato solo prima di launch");
        tasks.add(r);
    }

    public void launch() {
        launched = true;
        Collections.shuffle(tasks);
        for (Runnable task : tasks) {
            Thread t = new Thread(task);
            threads.add(t);
            t.start();
        }
    }

    public void join(Runnable r) {
        int index = tasks.indexOf(r);
        Thread t = threads.get(index);
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}