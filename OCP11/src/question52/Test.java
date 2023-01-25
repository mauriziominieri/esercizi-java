package question52;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */
/**
 Regole Override (metodi):
 1. Visibilità: uguale o maggiore
 2. Return type: compatibile (uguale o sottoclasse, es. Integer può overridare Number)
 3. Nome: uguale
 4. Parametri: uguali (anche di ordine)
 Regole Overload (metodi):
 1. Nome: uguale
 2. Parametri: differenti (l'ordine conta)
 */

/*
What is the output?
    The compilation fails.
 */
abstract class Base {
    abstract protected float getVal();
}
public class Test extends Base {
    public float getVal() { return 0f; }
//    public long getVal() { return 2L; } // Override non valido a causa del return type, inoltre già c'è il primo override
    public static void main(String[] args) {
        Test test = new Test();
        float f = test.getVal();
        System.out.println(f + test.getVal());
    }
}