package question147;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two codes, independently, can be inserted on line 1 to compile?
    1. Abacus aba = (a, b) -> a * b;
    2. Abacus aba = (int e, int f) -> { return e * f; };
 */
interface Abacus{
    public int calc (int a, int b);
}
public class Main {
    public static void main(String[] args) {
        int result = 0;
        // line 1
//        Abacus aba = (int m, int n) -> { m * n };
//        Abacus aba = (int i, j) -> { return i * j; };
//        Abacus aba = (a, b) -> a * b; // OK
        Abacus aba = (int e, int f) -> { return e * f; }; // OK
//        Abacus aba = v, w -> x * y;
        result = aba.calc(10, 20);
        System.out.println(result);
    }
}