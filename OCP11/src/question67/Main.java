package question67;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code, when inserted at one or more marked position, would allow classes B and C to compile?
    public void z() {} // position 3
 */
// il metodo void x() dell'interfaccia viene overridato tramite la classe astratta B che estende, C quindi deve solo overridare il metodo astratto void z()
interface A {
    abstract void x();
}
abstract class B /* position 1 */ {
    /* position 2 */
    public void x() {}
    public abstract void z();
}
class C extends B implements A {
   public void z() {} /* position 3 */
}
public class Main {}