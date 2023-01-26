package question170;

import java.util.HashMap;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

/*
What is the result?
    a b c null
 */
public class Main {
    public static void main(String[] args) {
        var h = new HashMap();
        String[] k = { "1", "2", null, "3" };
        String[] v = { "a", "b", "c", null };

        for (int i = 0; i < 4; i++) {
            h.put(k[i], v[i]);
            System.out.print(h.get(k[i]) + " ");
        }
    }
}