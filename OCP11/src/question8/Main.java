package question8;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The program prints nothing.
 */

public class Main {
    public static void main(String[] args) {
        int x = 0;
        do {
            x++;
            if (x==1) {
                continue;
            }
            System.out.println(x);
        } while(x < 1);
    }
}