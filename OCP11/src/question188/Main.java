package question188;

import java.util.function.*;
import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which action will enable the code to compile?
    IntFunction<IntUnaryOperator> func = x -> y -> x * y;
 */
// Ricorda che Function vuole 2 generic types, BiFunction ne vuole 3 e UnaryOperator sono due oggetti quindi '*' non è valido
public class Main {
    public static void main(String[] args) {
        IntStream str = IntStream.of(2, 3, 4);
///*6*/   IntFunction<Integer> func = x -> y -> x * y;
        IntFunction<IntUnaryOperator> func = x -> y -> x * y;
//        IntFunction<UnaryOperator> func2 = x -> y -> x * y;
//        BiFunction<Integer> func3 = x -> y -> x * y;
//        Function<UnaryOperator> func4 = x -> y -> x * y;
        str.map(func.apply(10)).forEach(System.out::println);
    }
}