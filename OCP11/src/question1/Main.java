package question1;

import java.nio.file.Path;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Why does D cause a compilation error?
    D inherits a() from B and C but the return types are incompatible
 */

interface A {
    public Iterable a();
}
interface B extends A {
    public Collection a();
}
interface C extends A {
    public Path a();
}
//public interface D extends B, C {}