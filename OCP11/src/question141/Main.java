package question141;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Taking into account that the order of the elements is unpredictable, what is the output?
    {mismatch=1, am=2, first=1, second=1}
 */
public class Main {
    public static void main(String[] args) {
        String[] words = {"am", "am", "first", "second", "mismatch"};
        Map map = Arrays.stream(words).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(map);
    }
}