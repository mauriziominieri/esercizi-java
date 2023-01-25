package question37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three are correct?
    1. f1.foo(li) prints Bonjour le monde!
    2. f2.foo(li) prints Hello world!
    3. b1.foo(li) prints Hola Mundo!
 */
class Foo {
    public void foo(Collection arg) {
        System.out.println("Bonjour le monde!");
    }
}
class Bar extends Foo {
    public void foo(Collection arg) {
        System.out.println("Hello world!");
    }
    public void foo(List arg) {
        System.out.println("Hola Mundo!");
    }
}
public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
        List<String> li = new ArrayList<>();
        f1.foo(li); // Bonjour le monde!
        f2.foo(li); // Hello world!
        b1.foo(li); // Hola Mundo!
    }
}