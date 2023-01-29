package question181;

import java.util.function.Predicate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement on line 1 enables the Test class to compile?
    if(p.test(number)) {
 */
public class Test {
    public static void main(String... args) {
        int number = 20;
        Predicate<Integer> p = a -> a % 2 != 0;
        if(p.test(number)) { // line 1
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is even.");
        }
    }
}