package question20;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    2,0,0
    2,1,0
    0,0,0
 */
class Thing {
    int x,y,z;
    public Thing() {
        this(2,1);
        System.out.println(x + "," + y + "," + z);
    }
    public Thing(int x) {
        System.out.println(x + "," + y + "," + z);
    }
    public Thing(int x, int y) {
        this(2);
        System.out.println(x + "," + y + "," + z);
    }
}
public class Tester {
    public static void main(String[] args) {
        Thing t1 = new Thing();
    }
}