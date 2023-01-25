package question88;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    15
 */
public class Main {
    public static void main(String[] args) {
        var i = 10;
        var j = 5;
        i += (j * 5 + i) / j - 2;
        System.out.println(i);
    }
}