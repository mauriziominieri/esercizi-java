package question96;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    -6
 */
// il ';' alla fine del for lo rende una singola istruzione, il System.out.print NON è al suo interno, quindi nel for viene solo calcolata sum
public class Tester {
    public static void main(String[] args) {
        int sum = 0, x = 0;
        for( ; x < 3 ; sum+=++x); // line 1
        System.out.print("-"+sum);
    }
}