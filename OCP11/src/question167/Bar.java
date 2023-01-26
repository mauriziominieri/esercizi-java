package question167;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements are true if the method is added to Bar?
    1. public <T> List<T> foo(Collection<T> arg) { ... } overrides Foo.foo.
    2. public <T> Collection<T> foo(Stream<T> arg) { ... } overloads Foo.foo.

 */
class Foo {
    public <T> Collection<T> foo(Collection<T> arg) { return null; }
}
public class Bar extends Foo {
//    public <T> Iterable<T> foo(Collection<T> arg) { return null; } // return type incompatibile, Iterable non è sottoclasse di Collection
    public <T> List<T> foo(Collection<T> arg) { return null; } // override corretto
//    public Collection<String> foo(Collection<String> arg) { return null; } // both methods have same erasure, yet neither overrides the other
    public <T> Collection<T> foo(Stream<T> arg) { return null; } // overload corretto
//    public <T> Collection<T> foo(Collection<T> arg) { return null; } // è un override e non un overload
//    public <T> Collection<T> bar(Collection<T> arg) { return null; } // il nome è bar, è proprio un altro metodo
}