package question31;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    3.0
 */
public class Main {
    public static void main(String[] args) {
        float x = 2, y = 4, z = 4;
        float a = y / x, b = y / z;
        if (a > b)
            System.out.println(a + b);
    }
}