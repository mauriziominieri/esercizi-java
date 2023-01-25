package question17;

import java.util.function.Supplier;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement on line 1 is calling the method of the supplier object correctly?
    System.out.println(supplier.get());
 */
public class Main {
    public static void main(String[] args) {
        Supplier supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}