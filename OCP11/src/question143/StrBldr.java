package question143;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/* Non confonderla con la 38
What is the result?
    hey oh hi yo ey
 */
public class StrBldr {
    static StringBuilder sb1 = new StringBuilder("yo ");
    StringBuilder sb2 = new StringBuilder("hi ");
    public static void main(String[] args) {
        sb1 = sb1.append(new StrBldr().foo(new StringBuilder("hey")));
        System.out.println(sb1);
    }

    StringBuilder foo(StringBuilder s) {
        System.out.print(s + " oh " + sb2);
        return new StringBuilder("ey");
    }
}