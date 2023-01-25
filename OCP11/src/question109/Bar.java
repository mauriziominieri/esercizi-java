package question109;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Bonjour le monde!
    Hello world!
 */
class Foo {
    private void print() { // è private, nel caso non sarà overridato
        System.out.println("Bonjour le monde!");
    }
    public void foo() {
        print();
    }
}
public class Bar extends Foo {
    private void print() {  // è un altro metodo, non è l'override di print() della superclasse
        System.out.println("Hello world!");
    }
    public void bar() {
        print();
    }
    public static void main(String... args) {
        Bar b = new Bar();
        b.foo();
        b.bar();
    }
}