package esercizio1b;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class Primes implements Iterable<Integer> {

    static Iterable<Integer> iterable = new Primes();

    private int last = 1;

    public Primes() {
        if(this.getClass() != Primes.class)
            throw new RuntimeException("Non puoi creare oggetti di tipo Primes");
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {    // classe anonima
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                if(last == 1) {
                    last = 3;
                    return 1;
                }
                for(int i = 2; i <= last / 2; i++)
                    if(last % i == 0) {
                        i = 1;
                        last++;
                    }
                return last++;
            }
        };
    }
}
