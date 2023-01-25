package question41;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What code should be written at line 3 to make this code print A?
    static String getFirstLetter() { return A.toString(); }
 */
enum Alphabet {
    A, B, C;
    static String getFirstLetter() { return A.toString(); } // line 3
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Alphabet.getFirstLetter());
    }
}