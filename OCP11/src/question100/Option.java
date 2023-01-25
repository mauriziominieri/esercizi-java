package question100;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    A java.util.NoSuchElementException is thrown at runtime.
 */
public class Option {
    public static void main(String[] args) {
        System.out.println("Ans : " + convert("a").get()); // fare la get su un Optional empty causa l'eccezione java.util.NoSuchElementException: No value present
    }
    private static Optional convert(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch(Exception e) { // java.lang.NumberFormatException: For input string: "a"
            return Optional.empty();
        }
    }
}