package question139;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the output?
    Duke
 */
public class Main {
    public static void main(String[] args) {
        Optional<String> value = createValue();
        String str = value.orElse("Duke");
        System.out.println(str);
    }
    static Optional<String> createValue() {
        String s = null;
        return Optional.ofNullable(s);  // restituisce un Optional con il valore s se non è null, altrimenti restituisce un Optional vuoto
    }
}