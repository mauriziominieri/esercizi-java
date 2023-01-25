package question61;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    Hello
 */
// se non devo considerare >/span> (credo un errore nel codice html del test) l'output sarà Hello in quanto il metodo greet è statico, quindi non mi serve un'istanza.
// se non fosse statico allora avrei un NullPointerException al c.greet().
public class Main {
    public static void greet(String... args) {
        System.out.print("Hello ");
        for (String arg : args) {
            System.out.println(arg);
        }
    } // >/span>
    public static void main(String[] args) {
        Main c = null;
        c.greet();
    }
}