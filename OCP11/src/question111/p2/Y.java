package question111.p2;

import question111.p1.X;    // funziona solo se X è public

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What does this compilation fail?
    The class X is not accessible in p2.
 */
public class Y extends X {  // se X non è public Y non può accerdervi
    public Y() {
        super(new ArrayList());
    }
    public void doProcess() {
        items.forEach(System.out::println);
    }
    public void removeItem(String item) {
        super.removeItem(item);
    }
}