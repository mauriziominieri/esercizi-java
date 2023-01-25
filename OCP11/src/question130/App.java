package question130;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
Which statement is true?
    The code fails to compile at line n1.
 */
// è possibile usare il tipo var solo nei metodi o inizializzatori (blocchi di codice)
public class App {
//    var a = true;           // line n1
    {
        final var b = 10;   // line n2
    }
    public static void main(String[] args) {
        int var = 100;      // line n3
        var b = "100";      // line n4
        System.out.println(b);
    }
}