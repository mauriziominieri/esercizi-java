package esercizio1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class PeriodicTask {

    private long time = 0;

    public PeriodicTask(Runnable r, long p) {
        Thread thread = new Thread(r);
        long start = System.currentTimeMillis();
        while(true) {
            try {
                thread.run();
                Thread.sleep(p);
                long end = System.currentTimeMillis();
                time = end - start;
//                System.out.println(getTotalTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public long getTotalTime() {
        return time;
    }
}
