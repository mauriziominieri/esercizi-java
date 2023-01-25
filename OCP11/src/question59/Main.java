package question59;

import java.util.function.Supplier;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which is true?
    The code does not compile.
 */
// Supplier è un'interfaccia parametrica con solo un metodo astratto T get().
// Supplier<Integer> foo = () -> 25; // foo è una funzione lambda che restituisce semplicemente il valore 25 quando viene chiamato il metodo "get" sull'oggetto "foo".
public class Main {
    void myLambda() {
        int i = 25;
        Supplier<Integer> foo = () -> i;
//        i++;  // le variabili locali nelle lambda devono essere final o effectively final, cioè una variabile che non è esplicitamente dichiarata come final, ma non viene mai modificata dopo la sua inizializzazione.
        System.out.println(foo.get());
    }
    public static void main(String[] args) {
        new Main().myLambda();
    }
}