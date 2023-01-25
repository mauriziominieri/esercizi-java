package question35;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    -----
    -----
    banana orange apple lemon apple banana lemon orange
 */
public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("banana", "orange", "apple", "lemon");
        Stream<String> s1 = fruits.stream();
        Stream<String> s2 = s1.peek(i -> System.out.print(i + " ")); // s2 contiene tutte le stringhe divise da spazio
        System.out.println("-----");
        Stream<String> s3 = s2.sorted(); // ordino lessicograficamente le stringhe
        Stream<String> s4 = s3.peek(i -> System.out.print(i + " ")); // s4 contiene s2 e s3
        System.out.println("-----");
        String strFruits = s4.collect(Collectors.joining(","));
    }
}