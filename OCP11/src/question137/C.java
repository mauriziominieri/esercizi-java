package question137;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What code inserted into class C would allow it to compile?
    public void x() { }
    public void z() { }
 */
interface A {
    abstract void x();
    public default void y() { }
}
abstract class B {
    public abstract void z();
}
public class C extends B implements A {
    /* insert code here */
    public void x() { }
    public void z() { }
}