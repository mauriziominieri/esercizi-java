package question155;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    1 2 [1, 2, 3, four] 3 4
 */
// se t è più veloce comunque viene fermato per 150 millisecondi, quindi è sempre il main a stampare nel for, quindi stampa 1, aspetta 100 mls (t è ancora in attesa dato che ne aspetta 150), il main stampa 2, t si sblocca e stampa tutto c, infine il main stampa gli ultimi due numeri (originali, quindi con il 4).
public class Main {
    public static void main(String[] args) throws InterruptedException {
        var c = new CopyOnWriteArrayList<>(List.of("1", "2", "3", "4"));
        Runnable r = () -> {
            try {
                Thread.sleep(150);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
            c.set(3, "four");
            System.out.print(c + " ");
        };
        Thread t = new Thread(r);
        t.start();
        for(var s: c) {
            System.out.print(s + " ");
            Thread.sleep(100);
        }
    }
}