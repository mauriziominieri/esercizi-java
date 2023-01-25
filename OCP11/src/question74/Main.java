package question74;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    80
 */
public class Main {
    public static void main(String[] args) {
        int i = 3;
        int j = 25;
        System.out.println( i > 2 ? i > 10 ? i * (j + 10) : i * j + 5 : i);
    }
}