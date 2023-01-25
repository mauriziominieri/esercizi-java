package question140;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Assuming the bodies are correct, which will result in a compilation error?
    public void foo (BiFunction<int, int, boolean> predicate) { }
 */
class Foo<T> {
    public Foo(BiFunction<T, T, T> op) { }
}
public class Main {
    public BiFunction<String, String, String> foo;
//    public void foo (BiFunction<int, int, boolean> predicate) { }
    public <T> BiFunction<T, T, Boolean> predicate(Function<T, T> transform) { return null; }
}