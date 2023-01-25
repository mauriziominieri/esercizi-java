package question53;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The compilation fails.
 */
// According to Java language specification, a local variable that is accessed from an inner class must be declared as final or effectively final. Since the variable "y" is not final, it cannot be accessed from the inner class "Computer".
public class Tester {
    public static int reduce(int x) {
        int y = 4;
        class Computer {
            int reduce(int x) {
//                return x-y--;   // y deve essere final o effectively final, cioè una variabile che non è esplicitamente dichiarata come final, ma non viene mai modificata dopo la sua inizializzazione.
                return 0;
            }
        }
        Computer a = new Computer();
        return a.reduce(x);
    }
    public static void main(String[] args) {
        System.out.print(reduce(1));
    }
}