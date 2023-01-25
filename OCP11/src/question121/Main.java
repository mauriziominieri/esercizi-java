package question121;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    A ConcurrentModificationException is thrown at runtime.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        Iterator<Integer> itr = a1.iterator();
        while(itr.hasNext()) {
            if (itr.next() == 2) {
                a1.remove(2);
                System.out.print(itr.next());
            }
        }
    }
}