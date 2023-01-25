package question158;

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
    A compile time error occours at line n2
 */
// In the method public static void display(var c) the var keyword is used as the parameter type which is not allowed in Java 11.
public class Main {
    public static void main(String[] args) {
        var lst = List.of(1, 2.0f, "4.0");
        for (var c : lst) {
            System.out.print("> " + c);
        }
        System.out.println();
        lst.add(2, 3); // line n1
        for (int c = 0; c < lst.size(); c++) {
//            display(lst.get(c));
        }
    }
//    public static void display(var c) { // line n2
//        System.out.print("> " + c);
//    }
}