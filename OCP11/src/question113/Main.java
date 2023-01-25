package question113;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    1 3 5 7 9
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        for( ; i<10; i++) {
            System.out.print(++i + " ");
        }
    }
}