package question175;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    1-5
 */
public class Tester {
    public static void main(String[] args) {
        int x = 0, y = 6;
        for( ; x < y; x++, y--) { // line 1
            if (x%2 == 0) {
                continue;
            }
            System.out.println(x+"-"+y);
        }
    }
}