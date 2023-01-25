package question33;

import java.util.stream.IntStream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement prints the same value of result?
    System.out.println(IntStream.rangeClosed(1, 100).count());
 */
public class Main {
    public static void main(String[] args) {
        var i = 1;
        var result = IntStream.generate(() -> { return i; }).limit(100).sum();
        System.out.println(result);

        System.out.println(IntStream.range(1, 100).count());    // 99
        System.out.println(IntStream.rangeClosed(1, 100).count());  // 100
        System.out.println(IntStream.rangeClosed(0, 100).map(x -> x).count()); // 101
        System.out.println(IntStream.range(0, 99).count()); // 99
    }
}