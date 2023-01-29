package question180;

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
Which three are true?
    1. f1.foo(c) prints Bonjour le monde!
    2. f2.foo(c) prints Hello world!
    3. b1.foo(c) prints Hello world!
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
        System.out.println("Olà Mundo!");
    }
}
public class Main {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();
        Collection<String> c = new ArrayList<>();
        f1.foo(c);
        f2.foo(c);
        b1.foo(c);
    }
}