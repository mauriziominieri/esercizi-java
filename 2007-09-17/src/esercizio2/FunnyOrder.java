package esercizio2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
(FunnyOrder, 2007-9-17)
Determinare l’output del seguente programma e descrivere brevemente l’ordinamento dei numeri
interi definito dalla classe FunnyOrder.
public class FunnyOrder implements Comparable<FunnyOrder> {
    private int val;
    public FunnyOrder(int n) { val = n; }
    public int compareTo(FunnyOrder x) {
        if (val%2 == 0 && x.val%2 != 0) return −1;
        if (val%2 != 0 && x.val%2 == 0) return 1;
        if (val < x.val) return −1;
        if (val > x.val) return 1;
        return 0;
    }
    public static void main(String[] args) {
        List<FunnyOrder> l = new LinkedList<FunnyOrder>();
        l .add(new FunnyOrder(16));
        l .add(new FunnyOrder(3));
        l .add(new FunnyOrder(4));
        l .add(new FunnyOrder(10));
        l .add(new FunnyOrder(2));
        Collections . sort(l );
        for (FunnyOrder f: l)
        System.out.println( f . val + "␣");
    }
}
 */

//Regola: se restituisce 1 allora val > x.val, quindi (3,16) ritorna 1, e quindi 3 viene messo DOPO 16...
public class FunnyOrder implements Comparable<FunnyOrder> {
    private int val;
    public FunnyOrder(int n) { val = n; }
    public int compareTo(FunnyOrder x) {    // confronti: (3,16),(4,3),(4,3),(4,16),(10,16),(10,4),(2,16),(2,10),(2,4) : 50,48,48,52,52,54,52,52,52.
        if (val%2 == 0 && x.val%2 != 0)
            return -1;
        if (val%2 != 0 && x.val%2 == 0)
            return 1;
        if (val < x.val)
            return -1;
        if (val > x.val)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        List<FunnyOrder> l = new LinkedList<FunnyOrder>();
        l.add(new FunnyOrder(16));
        l.add(new FunnyOrder(3));
        l.add(new FunnyOrder(4));
        l.add(new FunnyOrder(10));
        l.add(new FunnyOrder(2));
        Collections.sort(l);
        for (FunnyOrder f: l)
            System.out.println(f.val + " ");
    }
}
