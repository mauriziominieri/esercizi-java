package question27;

import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
You replace the code on line 1 to use ParallelStream.
Which one is correct?
    The code may produce a different result.
 */
/*
The findAny() method of a sequential stream returns the first element that meets the condition, it is deterministic, this means that for a given input it will always return the same output.
The findAny() method of a parallelStream is non-deterministic, it can return any element that meets the condition, and it's not guaranteed to return the first element that meets the condition.
 */
public class Main {
    public static void main(String[] args) {
        var fruits = List.of("apple","orange","banana","lemon");
        Optional<String> result = fruits.stream().filter(f -> f.contains("n")).findAny(); // line 1
        Optional<String> result1 = fruits.parallelStream().filter(f -> f.contains("n")).findAny();
        System.out.println(result.get());
        System.out.println(result1.get());
    }
}