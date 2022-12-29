package esercizio2;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public class B implements Cloneable {

    public B() {}
    public B(boolean b) {}

    public B f(Object o) {
        B b = new B();
        return b;
    }

    public B clone() {
        try {
            B b = (B) super.clone();
            return b;
        }
        catch(CloneNotSupportedException e) {
            return null;
        }
    }

    class C extends B {

        public C(int n) {}
        public C(boolean b) {}
    }
}
