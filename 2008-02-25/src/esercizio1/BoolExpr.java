package esercizio1;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Maurizio Minieri
 * @email: mauminieri@gmail.com
 * @website: www.mauriziominieri.it
 */

public abstract class BoolExpr {

    boolean value;

    public abstract boolean eval(Map<BoolVar,Boolean> m);
}
