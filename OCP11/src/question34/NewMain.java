package question34;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    sphynx
    oxicat
    laperm
    korat
    bengal
    abyssinian
 */
public class NewMain {
    public static void main(String[] args) {
        String[] catNames = { "abyssinian", "oxicat", "korat", "laperm", "bengal", "sphynx" };
        var cats = new ArrayList<>(Arrays.asList(catNames));
        cats.sort((var a, var b) -> -a.compareTo(b));
        cats.forEach(System.out::println);
    }
}