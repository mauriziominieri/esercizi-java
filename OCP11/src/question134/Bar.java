package question134;

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
What is the output?
    Hello world!
    Bonjour le monde!
 */
class Foo {
    public void foo(Collection arg) {
        System.out.println("Bonjour le monde!");
    }
}
public class Bar extends Foo {
    public void foo(List arg) { // overload e NON un override (i parametri sono diversi)
        System.out.println("Hello world!");
    }
    public static void main(String... args) {
        List<String> li = new ArrayList<>();
        Collection<String> co = li;
        Bar b = new Bar();
        b.foo(li);
        b.foo(co);
    }
}