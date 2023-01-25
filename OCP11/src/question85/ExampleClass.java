package question85;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which three statements cause a compiler error when inserted at line 1?
    1. int i = theInstance.three++;
    2. int a = one++;
    3. int e = ExampleInterface.two++;
 */
// Ricorda che gli attributi in una interfaccia sono DI DEFAULT public static final e DEVONO essere così (non puoi cambiare nulla)
interface ExampleInterface {
    int one = 1;
    static int two = 2;
    static final int three = 3;
}
public class ExampleClass implements ExampleInterface {
    public static void main(String[] args) {
        ExampleInterface theInstance = new ExampleClass();
        // line 1
//        int i = theInstance.three++;      // three è final
        int d = ExampleInterface.one;
//        int a = one++;                    // one è final
//        int e = ExampleInterface.two++;   // two è final
        int f = ExampleInterface.three;
        int c = three;
        int g = theInstance.one;
        int h = theInstance.two;
    }
}