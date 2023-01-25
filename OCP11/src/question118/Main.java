package question118;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You want to make the reduction operation parallelized.
Which two modifications will accomplish this?
    1. int sum = numbers.parallelStream().reduce(0, (n, m) -> n + m);
    2. int sum = numbers.stream().parallel().reduce(0, (n, m) -> n + m);
 */
// Ricorda parallelStream e parallel, che è un metodo dello stream
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 0, 8, 1, 9, 5, 7, 6, 4);
        int sum = numbers.stream().reduce(0, (n, m) -> n + m); // line 1

//        int sum1 = numbers.stream().iterate(0, a -> a+1).reduce(0, (n, m) -> n + m);
//        int sum2 = numbers.stream().flatMap(a -> a).reduce(0, (n, m) -> n + m);
//        int sum3 = numbers.parallel().stream().
        int sum4 = numbers.parallelStream().reduce(0, (n, m) -> n + m);
        int sum5 = numbers.stream().parallel().reduce(0, (n, m) -> n + m);
    }
}