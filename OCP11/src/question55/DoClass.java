package question55;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    An exception is thrown at runtime.
 */
public class DoClass {
    static String s;
    public static void main(String[] args) {
        switch(s) { // java.lang.NullPointerException
            case "41": s += "41";
            default:   s += " def ";
            case "42": s += "42";
        }
        System.out.println(s);
    }
}