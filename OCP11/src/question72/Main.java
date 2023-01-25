package question72;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The program throws an exception.
 */
// java.lang.ArrayStoreException: Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects. For example, the following code generates an ArrayStoreException:
//     Object x[] = new String[3];
//     x[0] = new Integer(0);
class A {
    public void print() { System.out.print("A"); }
}
class B extends A {
    public void print() { System.out.print("B"); }
}
class C extends A {
    public void print() { System.out.print("C"); }
}
public class Main {
    public static void main(String[] args) {
        A[] values = new B[2];
        values[0] = new C();
        values[0].print();
    }
}