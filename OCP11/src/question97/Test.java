package question97;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Hello World
 */
public class Test {
    private static class Greet {
        private void print() {
            System.out.println("Hello World");
        }
    }
    public static void main(String[] args) {
        Test.Greet i = new Greet();
        i.print();
    }
}