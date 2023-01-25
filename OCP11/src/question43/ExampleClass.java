package question43;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two, when inserted at line n1 independently, will cause a compilation error?
    1. theInstance.exampleMethod(ExampleAbstractClass.origin, ExampleInterface.origin); // dato che il tipo dichiarato è l'interfaccia non ci sono firme candidate
    2. theInstance.exampleMethod(origin); // non sa quale dei due origin usare, origin ambiguous
 */
interface ExampleInterface {
    static String origin = "Interface";
    void exampleMethod(String first);
}
abstract class ExampleAbstractClass {
    static String origin = "Abstract Class";
    abstract void exampleMethod(String first, String second);
}
public class ExampleClass extends ExampleAbstractClass implements ExampleInterface {
    public void exampleMethod(String first) {}
    public void exampleMethod(String first, String second) {}
    public static void main(String[] args) {
        ExampleInterface theInstance = new ExampleClass();
        //line n1
    }
}