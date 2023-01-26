package question164;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    An exception is thrown at run time.
 */
public class Main {
    public static void main(String[] args) {
        String s = "Oracle";
        Runnable r = () -> {
            System.out.println(s); // ables referenced from a lambda expression must be final or effectively final
        };
//        s = "Java";
        Thread t = new Thread(r);
        t.start();
    }
}