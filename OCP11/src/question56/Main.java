package question56;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    The program prints 3 4 and throws a ClassCastException.
 */
/*
The code will throw a compile-time error because the "for" loop is trying to iterate over the ArrayList with a type of Integer, but the ArrayList was passed to the "add" method which added a Float value.
The error will be "incompatible types: Object cannot be converted to Integer"
It is not possible to iterate through the ArrayList x with a for-each loop because the ArrayList contains elements of different types, namely an Integer and a Float, which are not compatible.
It's possible to fix this issue by using a traditional for loop, by adding a cast to (Integer) before the variable i, or by using a different variable type that can hold any type, like Object.
Another way to fix this is to change the type of the list to List<Object> and the add function should be changed to add only objects, in this way the iteration will be done without errors.
 */
public class Main {
    static void add(List l) {
        l.add(4);
        l.add(3.14f);
    }
    public static void main(String[] args) {
        var x = new ArrayList();
        x.add(3);
        add(x);
//        for (Integer i : x) {
//            System.out.print(i + " ");
//        }
    }
}