package question124;

import java.util.function.BiPredicate;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*  TODO: ne vuole 2 ma solo una compila correttamente
Which two are valid statements?
    1. BiPredicate test = (var x, final var y) -> (x.equals(y));
    2. BiPredicate test = (Integer x, final Integer y) -> (x.equals(y));
 */
/*
Dato l'errore: Cannot mix 'var' and explicitly typed parameters in lambda expression allora per esclusione direi che le due corrette sono (Integer, Integer) e (var, var)
 */
public class Main {
    public static void main(String[] args) {
//        BiPredicate test = (Integer x, final var y) -> (x.equals(y));
//        BiPredicate test = (Integer x, final Integer y) -> (x.equals(y));
//        BiPredicate test = (final Integer x, var y) -> (x.equals(y));
        BiPredicate test = (var x, final var y) -> (x.equals(y));
//        BiPredicate test = (final var x, y) -> (x.equals(y));
    }
}