package question111.p1;

import java.util.List;

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
public abstract class X {  // ho dovuto mettere io public, altrimenti sarebbe package-private, quindi visibile solo nello stesso package
    protected final List items;
    protected X(List items) {
        this.items = items;
    }
    protected abstract void doProcess();
    public void removeItem(String item) {
        items.remove(item);
    }
}