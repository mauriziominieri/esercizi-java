package question119;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Assuming that code compiles correctly, which three statements are true?
    1. B is a subtype of A.
    2. B cannot be abstract.
    3. A cannot be final.
 */
/*
B extends A: Dato che il metodo build è un Override allora deve avere un tipo di ritorno compatibile con quello dell'interfaccia
B cannot be astract: return new B(str) non sarebbe possibile se fosse abstract, le classi astratte non possono essere istanziate
A cannot be final: se fosse final non potrei overridarla e non potrebbe esistere il metodo overridato B build()
 */
interface Builder {
    public A build(String str);
}
public class BuilderImpl implements Builder {
    @Override
    public B build(String str) {
        return new B(str);
    }
}

class B extends A {
    public B(String s) {}
}
abstract class A {}