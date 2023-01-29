package question38;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/* Non confonderla con la 143
What is the result?
    yo hi hey oh
 */
public class StrBldr {
    static StringBuilder sb1 = new StringBuilder("yo ");
    static StringBuilder sb2 = new StringBuilder("hi ");

    public static void main(String[] args) {
        sb1 = sb1.append(new StrBldr().foo(new StringBuilder("hey"))); // sb1 = sb1.append... già capisco che la prima parola è "yo"
        System.out.println(sb1);
    }

    StringBuilder foo(StringBuilder s) {
        sb2 = sb2.append(s + " oh ");
        return sb2;
    }
}