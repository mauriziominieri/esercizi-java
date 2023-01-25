package question136;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three changes make this code compile?
    1. InterfaceTwo should no longer extend AbstractClass
    2. Implement methodB() in ConcreteClass
    3. Implement methodC() in ConcreteClass
 */
interface InterfaceOne {
    public void methodA();
    public void methodB();
}
interface InterfaceTwo { } // extends AbstractClass { }
abstract class AbstractClass implements InterfaceOne {
    public String origin = "Abstract Class";
    public void methodA() {
        System.out.println("A");
    }
    public abstract void methodC();
}
public class ConcreteClass extends AbstractClass {
    public void methodC(String c) {
        System.out.println(c);
    }
    public void methodB() { }
    public void methodC() { }
}