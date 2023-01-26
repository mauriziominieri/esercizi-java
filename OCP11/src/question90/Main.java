package question90;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two code fragments, independently, replace line 1 to implement the equivalent reduce operation?
    1. OptionalInt value = data.mapToInt(a -> a).parallel().reduce((a, b) -> a+b);
       Integer sum1 = value.getAsInt();
    2. Integer sum = data.mapToInt(a -> a).reduce(0, (a,b)->a+b);
 */
// Ricorda mapToInt, una Integer e una OptionalInt, una con lo 0 nella reduce e l'altra no.
public class Main {
    public static void main(String[] args) {
        Stream<Integer> data = IntStream.range(1, 10000).boxed();
        Integer sum = data.mapToInt(a -> a).sum(); //line 1

//        Integer sum = data.map(a -> a).reduce((a, b) -> a+b);

//        int s = 0;
//        Integer sum = data.map(a -> a).reduce((a, b) -> a + s);

//        OptionalInt value = data.mapToInt(a -> a).parallel().reduce(0, (a, b) -> a+b);
//        Integer sum = value.getAsInt();

//        OptionalInt value = data.mapToInt(a -> a).parallel().reduce((a, b) -> a+b);
//        Integer sum1 = value.getAsInt();
//
//        Integer sum2 = data.mapToInt(a -> a).reduce(0, (a,b)->a+b);

        System.out.println(sum);
    }
}