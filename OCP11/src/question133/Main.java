package question133;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    Hello world!
    Hello world!
    Bonjour le monde!
 */
class Foo {
    private String a() {    // private!
        return "Hello world!";
    }
    public String b() {
        return a();
    }
}
class Bar extends Foo {
    protected String a() {  // non è un override in quanto a() di Foo è private
        return "Bonjour le monde!";
    }
}
class Baz extends Bar {
    public String b() {
        return a();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(new Foo().b());
        System.out.println(new Bar().b());
        System.out.println(new Baz().b());
    }
}