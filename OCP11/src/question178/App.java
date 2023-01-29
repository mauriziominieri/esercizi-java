package question178;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which code fragment added to line 1 enables the code to compile and print Hello Joe?
    class Greeting {
        private void greet(String name) {
            System.out.println("Hello " + name);
        }
    }
 */
public class App {
    // line 1
    class Greeting {
        private void greet(String name) {
            System.out.println("Hello " + name);
        }
    }
    public static void main(String[] args) {
        new App().new Greeting().greet("Joe");
    }
}