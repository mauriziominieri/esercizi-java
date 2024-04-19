package esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class MultiQueue<T> {
    private final int n;
    private final List<BlockingQueue<T>> queues;

    public MultiQueue(int n) {
        if (n < 1)
            throw new IllegalArgumentException(n + " must be greater than 1");
        this.n = n;
        this.queues = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            this.queues.add(new LinkedBlockingQueue<>());
        }
    }

    public void add(T item) {
        int minIndex = 0;
        int minSize = queues.get(0).size();

        for (int i = 1; i < n; i++) {
            int size = queues.get(i).size();
            if (size < minSize) {
                minSize = size;
                minIndex = i;
            }
        }

        queues.get(minIndex).offer(item);
    }

    public T get(int i) throws InterruptedException {
        if (i < 0 || i >= n)
            throw new IllegalArgumentException(i + " must be positive and less than " + n);
        return queues.get(i).take();
    }
}
