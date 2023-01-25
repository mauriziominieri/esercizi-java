package question5;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Output?
    Derived class
 */

class A {
    void print() {
        System.out.println("Base class");
    }
}
public class B extends A {
    protected void print() {
        System.out.println("Derived class");
    }
    public static void main(String[] args) {
        B b = new B();
        ((A)b).print();
    }
}