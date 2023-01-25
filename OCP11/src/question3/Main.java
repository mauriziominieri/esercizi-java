package question3;

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
    Hello world!
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
}
public class Main {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        Bar b = new Bar();
        Foo f = b;
        b.foo(li);
        f.foo(li);
    }
}