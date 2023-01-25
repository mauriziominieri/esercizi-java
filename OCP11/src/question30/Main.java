package question30;

import java.util.Arrays;
import java.util.function.UnaryOperator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which can replace line 11?
    UnaryOperator<Integer> uo = (var x) -> (x * 3);
 */
public class Main {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5,6,7};
        var list = Arrays.asList(ints);
        UnaryOperator<Integer> uo = x -> x * 3; // line 11
        list.replaceAll(uo);
//        UnaryOperator<Integer> uo1 = var x -> { return x * 3; } // var x va tra tonde
//        UnaryOperator<Integer> uo2 = x -> { return x * 3 }; // non c'è il ';' dopo il 3
        UnaryOperator<Integer> uo3 = (var x) -> (x * 3);
//        UnaryOperator<Integer> uo4 = (int x) -> x * 3;  // le lambda non accettano tipi primitivi
    }
}