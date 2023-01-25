package question14;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which describes the fragment?
    It is subject to livelock
 */
// se entrambi i thread tentano di acquisire la risorsa contemporaneamente, entrambi rimarranno bloccati in un ciclo infinito, in attesa che l'altro lavoratore rilasci la risorsa. Questo è chiamato livelock, in cui due o più thread non sono in grado di procedere perché sono bloccati in attesa che l'altro thread rilasci una risorsa.
class Resource {
    public Worker owner;
}
class Worker {
    private boolean ready = true;
    public synchronized boolean isReady() {
        return ready;
    }
    public synchronized void work(Worker other, Resource resource) {
        while (ready) {
            while (resource.owner != this) {
                try {
                    wait(10);
                }
                catch (InterruptedException e) {}
            }
            if (other.isReady()) {
                resource.owner = other;
            }
            else {
                // do work with resource
                ready = false;
                resource.owner = other;
            }
        }
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Resource r = new Resource();
        resource.owner = w1;
        new Thread(() -> {
            w1.work(w2, r);
        }).start();
        new Thread(() -> {
            w2.work(w1, r);
        }).start();
    }
}
public class Main {}