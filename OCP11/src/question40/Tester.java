package question40;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    4
 */
public class Tester {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        sb.append("HOWDY");                      // "HOWDY"
        sb.insert(0, ' ');              // " HOWDY"
        sb.replace(3, 5, "LL");    // " HOLLY"
        sb.insert(6, "COW");           // " HOLLYCOW"
        sb.delete(2, 7);                         // " HOW"
        System.out.println(sb.length());         // 4
    }
}