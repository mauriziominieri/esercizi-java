package question172;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which would cause s to be AQCD?
    s.replace(s.indexOf("B"), s.indexOf("C"), "Q");
 */
public class Main {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("ABCD");
        s.replace(s.indexOf("B"), s.indexOf("C"), "Q");
        System.out.println(s);
    }
}