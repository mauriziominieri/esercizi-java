package question22;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which two statements compile?
    1. Double b = Double.valueOf(i);
    2. double d = i;
 */
public class Main {
    public static void main(String[] args) {
        Integer i = 11;
        Double b = Double.valueOf(i);
//        double e = Double.parseDouble(i);   // String required, pensa alla parola "parse" che in genere ha a che fare con le stringhe
//        Double a = i;                       // Double required
//        Double c = (Double) i;              // Inconvertible
        double d = i;
    }
}