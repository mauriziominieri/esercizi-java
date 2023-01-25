package question114;

import java.util.function.LongFunction;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    The compilation fails.
 */
// senza inserire il tipo <Long> alla LongFunction allora il metodo apply() vuole un Object
public class LongFunctionTest {
    public static void main(String[] args) {
        LongFunction func = x -> x * x;
//        long test = func.apply(100);
//        System.out.println(test);
    }
}