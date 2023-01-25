package question46;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    A runtime exception is thrown.
 */
public class Main {
    public static void main(String[] args) {
        List even = List.of(); // Returns an unmodifiable list containing zero elements
        even.add(0, -1); // java.lang.UnsupportedOperationException
        even.add(0, -2);
        even.add(0, -3);
        System.out.println(even);
    }
}