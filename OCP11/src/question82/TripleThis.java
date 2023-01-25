package question82;

import java.util.function.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Compiling TripleThis.java gives this compiler warning:
Note: TripleThis.java uses unchecked or unsafe operations.
Which two replacements remove this compiler warning and prints 12?
    1. Replace line 12 with public static void printValue(Function f, Integer num) {
    2. Replace line 12 with public static void printValue(Function f, int num) {
 */
public class TripleThis {
    public static void main(String[] args) {
/*9*/   Function tripler = x -> { return (Integer) x * 3; };
        TripleThis.printValue(tripler, 4);
    }
/*12*/public static void printValue(Function f, int num) {
        System.out.println(f.apply(num));
    }
}