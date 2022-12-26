package esercizio2;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Object x = new Object();
        final int [] count = new int[1]; // Don’t do this: use AtomicInteger
        class MyThread extends Thread {
            public void run() {
                synchronized (x) {
                    count[0]++;

                    x. notify () ;
                    System.out.println(count[0]) ;
                }
            }
        }
        Thread t1 = new MyThread(), t2 = new MyThread(), t3 = new MyThread();
        t1. start () ; t2. start () ; t3. start () ;
        synchronized (x) {
            count[0] = -1;
            while (count[0]<0) x.wait();
        }
        t2. join () ;
        System.out.println("Fatto");
    }
}
