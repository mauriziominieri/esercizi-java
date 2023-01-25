package question101;

import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which can replace line 2?
    UnaryOperator<Integer> u = (var i) -> (i * 2);
 */
public class Main {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8,9,10);
///*2*/   UnaryOperator u = i -> i * 2;
//        UnaryOperator<Integer> u = var i -> { return i * 2; }; // var i non tra tonde
//        UnaryOperator<Integer> u = i -> { return i * 2}; // non c'è il ';' dopo il 2
//        UnaryOperator<Integer> u = (int i) -> i * 2; // tipi primitivi non consentiti nelle lambda
        UnaryOperator<Integer> u = (var i) -> (i * 2);
        list.replaceAll(u);
    }
}