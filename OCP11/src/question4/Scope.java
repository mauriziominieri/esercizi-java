package question4;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which is true?
    The code does not compile successfully
 */

public class Scope {
    static int myint=666;
    public static void main(String[] args) {
//        int myint = myint;
        System.out.println(myint);
    }
}